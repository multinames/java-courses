package com.company.JavaRush.levels1_3;

public class Truck {

    int length;
    int width;
    int height;

    int weight;
    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}