package com.company.YandexTasks.Json;

import com.company.YandexTasks.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create() ;

    public static void main(String[] args) {

      //  String json = GSON.toJson();

       String json = null;

        PersonToJSon person1 = GSON.fromJson(json, PersonToJSon.class);

//        System.out.println(person1.getId());
  //      System.out.println(person1.getName());

        readFronJson("c:\\tmp\\file2json.txt");

    }

    public static void readFronJson(String file) {
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        char [] a = new char[200];   // Количество символов, которое будем считывать
        try {
            fr.read(a);   // Чтение содержимого в массив
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
