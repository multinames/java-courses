package com.company.YandexTasks.Json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PersonToJSon implements Serializable {
    private int id;
    private String name;
    private List<String> geo = new ArrayList<>();



    public PersonToJSon(int id, String name, List<String> geo) {
        this.id = id;
        this.name = name;
        this.geo = geo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
