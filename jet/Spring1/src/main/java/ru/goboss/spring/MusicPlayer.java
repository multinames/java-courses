package ru.goboss.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
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

      /*@Autowired
     @Qualifier("classicMusic")*/
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    /*@Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }*/

    // @Autowired
    /*public MusicPlayer(Music music) {

        this.music = music;
    }*/
    /*@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic(AllMusic genre) {

        /*String genre1 = new String("RockMusic");
        String genre2 = new String("ClassicMusic");*/

        Random r = new Random();
        int x = r.nextInt(2);

              if (genre.equals(AllMusic.RockMusic)) {
            System.out.println("Playing: " + music2.getSong().get(x));
        } else if (genre.equals(AllMusic.ClassicMusic)) {
            System.out.println("Playing: " + music1.getSong().get(x));
        }
    }
}
