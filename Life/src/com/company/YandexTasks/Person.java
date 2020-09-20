package com.company.YandexTasks;

import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    private String name;

    public static void main(String[] args) {
        Person p1 = new Person(1,"Иван");
        System.out.println(p1.getId());
        p1.setId(18);
        System.out.println(p1.getId());
        System.out.println(p1);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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
