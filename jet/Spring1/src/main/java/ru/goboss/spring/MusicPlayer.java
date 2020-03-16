package ru.goboss.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

   /* private ClassicMusic classicMusic;
    private RockMusic rockMusic;*/

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

    public void playMusic() {
        System.out.println("Playing: " + music1.getSong()+ ", " + music2.getSong() );
      //  System.out.println("Playing: " + rockMusic.getSong());
    }
}
