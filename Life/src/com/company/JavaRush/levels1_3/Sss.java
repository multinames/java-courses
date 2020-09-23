package com.company.JavaRush.levels1_3;

public class Sss {
    public static void main(String[] args) {
        String s = "Hello world blue read see";
        String[] s1 = s.split(" ");
        String s2 = "";

        //StringBuilder s2 = new StringBuilder();

        for (int i = s1.length; i != 0; i--) {
            s2=s2+s1[i - 1];
            //s2.append(s1[i - 1]);
        }
        System.out.println(String.join(" ",s2));

    }
}
