package com.company.JavaRush.level5;

public class People {
    public static void main(String[] args) {
        Man man1 = new Man("Иван",12,"Москва, Полконка, 12");
        Man man2 = new Man("Петр",17,"Москва, Полконка, 14");

        Woman woman1 = new Woman("Ирина", 15,"Москва, Кремль, 1");
        Woman woman2 = new Woman("Юоия", 14,"Москва, Кремль, 2");

        System.out.println(man1.name+ " "+man1.age+" "+man1.address);
        System.out.println(man2.name+ " "+man2.age+" "+man2.address);

        System.out.println(woman1.name+ " "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+ " "+woman2.age+" "+woman2.address);
    }
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
