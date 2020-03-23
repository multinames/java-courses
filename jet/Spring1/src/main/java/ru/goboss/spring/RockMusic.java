package ru.goboss.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Wind cries Mary");
        list.add("Hotel California");
        list.add("What Can I Do");
        return list;
    }
}
