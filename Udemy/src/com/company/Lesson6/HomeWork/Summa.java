package com.company.Lesson6.HomeWork;

public class Summa {

    int sum(){
        return 0;
    }
    int sum(int i1){
        return i1;
    }

    int sum(int i1, int i2){
        return i1+ i2;
    }

    int sum(int i1, int i2, int i3){
        return i1+ i2 + i3;
    }

    int sum(int i1, int i2, int i3, int i4){
        return i1+ i2 +i3 + i4;
    }
}

class TestSumma{

    public static void main(String[] args) {
        Summa s1 = new Summa();
        System.out.println(s1.sum());
        System.out.println(s1.sum(1));
        System.out.println(s1.sum(1,2));
        System.out.println(s1.sum(1,2,3));
        System.out.println(s1.sum(1,2,3,4));

    }


}