package ru.goboss.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    /*private ClassicMusic(){}

    public static ClassicMusic getClassicalMusic(){
        return new ClassicMusic();
    }

    public void doInit(){
        System.out.println("Инициализация Бина");
    }
    public  void doClose(){
        System.out.println("Уничтожение Бина");
    }*/

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
