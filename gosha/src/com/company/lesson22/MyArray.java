package com.company.lesson22;

public class MyArray implements Array { // Данный класс реализует интерфейс

    int a [] = new int [4]; // размер массива a[]
    int size = 0;

    @Override  // реализация метода Get интерфейса Array
    public int Get(int i) {
        return a[i];
    }

    @Override  // реализация метода Add интерфейса Array
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;

        } else
        return false;
    }
}
