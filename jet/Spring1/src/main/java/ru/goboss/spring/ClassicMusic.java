package ru.goboss.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

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
    public ArrayList<String> getSong() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hungarian Rhapsody");
        list.add("Heart of Courage");
        list.add("River Flows In You");
        return list;
    }
}
