package ru.goboss.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    // @Autowired
    // private Music music;

   @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    // @Autowired
    /*public MusicPlayer(Music music) {

        this.music = music;
    }*/
    /*@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }*/

    public void playMusic() {
        System.out.println("Playing: " + classicMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
    }
}
