package com.company.lesson22;

public class MyArrayN implements Array{

    int a [] = new int [4]; // размер массива a[]
    int size = 0;

    @Override  // реализация метода Get интерфейса
    public int Get(int i) {
        if (i < a.length)
            return a[a.length - i - 1];
        else
            return a[0];
    }

    @Override  // реализация метода Add интерфейса
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
