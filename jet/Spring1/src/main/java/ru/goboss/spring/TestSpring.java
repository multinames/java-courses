package ru.goboss.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

/*
        Music music = context.getBean("musicBean", Music.class );
        MusicPlayer musicPlayer = new MusicPlayer(music);
*/

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean compare = firstMusicPlayer == secondMusicPlayer;
        firstMusicPlayer.setVolume(10);

        // musicPlayer.playMusic();

        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        System.out.println(compare);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        context.close();

              /*  TestBean testBean1 = context.getBean("testBean",TestBean.class);
                System.out.println(testBean1.getName());
                context.close();;*/
    }
}
