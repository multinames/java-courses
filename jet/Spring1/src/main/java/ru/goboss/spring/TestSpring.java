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

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();

              /*  TestBean testBean1 = context.getBean("testBean",TestBean.class);
                System.out.println(testBean1.getName());
                context.close();;*/
    }
}
