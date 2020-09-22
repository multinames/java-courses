package com.company.JavaRush;

public class String1 {
    public static void main(String[] args) {
        System.out.println(rearrangement("мама мыла раму"));
    }

    public static StringBuilder rearrangement(String s) {
        String[] s1 = s.split(" "); //разделяем строку на подстроки
        StringBuilder s2 = new StringBuilder(); // создаем новую строку
        for (int i = s1.length; i != 0; i--) { // переставляем слова
            s2.append(s1[i - 1] + " ");
                  }
        return s2;
    }
}
