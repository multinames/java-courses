package com.company.JavaRush.lavel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catMother);
        System.out.println(catFather);
        System.out.println(catDaughter);
    }

    public static class Cat {

        private String name;
        private Cat parent;
        private Cat parent2;


        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {

            if (parent == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;

        }

    }
}
