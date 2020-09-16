package com.company.JavaRush.lavel6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cats2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);


        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null,catGrandMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
//        System.out.println(catMother);
//        System.out.println(catDaughter);

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
            if (parent == null & parent2 ==null)
                return "The cat's name is " + name + ", no mother, no father";

            else if (parent == null)
                return "The cat's name is " + name + ", mother is, "+ parent2.name + "no father" ;
//
//            else if (parent2 == null)
//                return "The cat's name is " + name + ", no mother, father is" +parent2.name;

            else
                return "The cat's name is " + name + ", mother is " + parent.name + ", father is " + parent2.name;
        }

    }



}
