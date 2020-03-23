package ru.goboss.spring;

import java.util.ArrayList;

public class JazzMusic implements Music {
    @Override
    public ArrayList<String> getSong() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jazz Band");
        return list;
    }
}
