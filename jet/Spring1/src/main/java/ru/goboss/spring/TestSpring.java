package ru.goboss.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class 
        );
/*
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);


        System.out.println(musicPlayer.playMusic());

        // AllMusic allMusic = AllMusic.ClassicMusic;

        /*Music music = context.getBean("classicMusic", Music.class );
        MusicPlayer musicPlayer = new MusicPlayer(music);*/

        // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        /*musicPlayer.playMusic();*/

       /* Music music2 = context.getBean("rockMusic", Music.class );
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);

        classicalMusicPlayer.playMusic();*/

        context.close();


    }
}
