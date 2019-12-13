package com.company.lesson22;

public class MyArray implements Array { // Данный класс реализует интерфейс
    int a [] = new int [4];
    int size = 0;

    @Override  // реализация метода интерфейса Get
    public int Get(int i) {
        return a[i];
    }

    @Override  // реализация метода интерфейса Get
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;

        } else
        return false;
    }
}
