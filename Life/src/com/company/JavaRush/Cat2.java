package com.company.JavaRush;

import java.util.Objects;

public class Cat2 {
    String name;

    public  Cat2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat2 cat2 = (Cat2) o;
        return Objects.equals(name, cat2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        Cat2 cat1 = new Cat2("Vaska");
        Cat2 cat2 = new Cat2("Vaska");
        System.out.println(cat1.equals(cat2));
    }
}
