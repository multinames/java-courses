package ru.goboss.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

   @Value("${musicPlayer.name}")
   private String name;

   @Value("${musicPlayer.volume}")
   private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList)
    {
        this.musicList = musicList;
    }


    public String playMusic() {

        Random r = new Random();
        //int x = r.nextInt(2);


            return "Playing: " + musicList.get(r.nextInt(musicList.size())).getSong() + " Volume " + this.volume;

    }
}
