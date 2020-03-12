package ru.goboss.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
   // private  Music music;

    private List<Music> musicList = new ArrayList<>();

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /*public void setMusic(Music music) {
        this.musicList = (List<Music>) music;
    }*/

    public MusicPlayer() {
    }

    //IoC
    /*public MusicPlayer(Music music){
        this.musicList = (List<Music>) music;
    }*/

    public void playMusic(){

        for (Music music : musicList)
        System.out.println("Playing : "+ music.getSong());
    }
}
