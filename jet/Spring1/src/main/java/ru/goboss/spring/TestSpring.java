package ru.goboss.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        //musicPlayer.playMusic(AllMusic.RockMusic);

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
