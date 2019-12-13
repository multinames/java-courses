package com.company;

public class Works extends Human {
    char workHuman = 'y';

    public Works (String sex, String name, int ah, char workHuman) {
        super(sex, name, ah);
        this.workHuman = workHuman;
        }

    void Itogo () { //метдод выводит значения класса Works
        System.out.println(super.sex);
        System.out.println(super.name);
        System.out.println(super.ageHuman);
        System.out.println(workHuman);
    }
}
