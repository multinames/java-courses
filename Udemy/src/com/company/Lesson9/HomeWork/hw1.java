package com.company.Lesson9.HomeWork;

public class hw1 {
    String name;
    static int count;

    hw1(String name){
        this.name = name;
    }
}

class Hw1Test{
    public static void main(String[] args) {

    hw1 h1 = new hw1("Ivan");
        h1 = null;
    hw1 h2 = new hw1("Piter");
        h2 = null;
    hw1 h3 = new hw1("Mike");
        h3= null;
    hw1 h4 = new hw1("Olga");
        h4=null;
    hw1 h5 = new hw1("Serge");
        h5=null;
    hw1 h6 = new hw1("Jonh");
        h6=null;
    hw1 h7 = new hw1("Monica");
    hw1 h8 = new hw1("Margo");


        System.out.println(h7.name + h8.name);
    }
        }