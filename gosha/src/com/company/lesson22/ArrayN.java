package com.company.lesson22;

public class ArrayN implements Array{
    int a [] = new int [4];
    int size = 0;

    @Override  // реализация метода интерфейса Get
    public int Get(int i) {
        if (i < a.length)
            return a[a.length - i - 1];
        else
            return a[0];
    }

    @Override  // реализация метода интерфейса Add
    public boolean Add(int val) {
        if (size != a.length) {
            a[size] = val;
            size++;
            return true;
        } else
            return false;
    }
}
