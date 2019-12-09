package com.company.lesson15;

public class Transport {
    protected float speed;
}

class Auto extends Transport {
    private String model;

    Auto (float speed, String model) {
        this.speed = speed;
        this.model = model;
        System.out.println("Скорость: " + speed + ", модель - " + model);
    }
}
