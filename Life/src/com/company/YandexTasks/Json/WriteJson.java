package com.company.YandexTasks.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteJson {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create() ;

    public static void main(String[] args) {
        PersonToJSon person1 = new PersonToJSon(1, "Иван", Arrays.asList("Москва", "Дубай", "Токио"));
        //PersonToJSon person2 = new PersonToJSon(2,"Марья");

        String json = GSON.toJson(person1);

        System.out.println(json);

        File file = new File("c:\\tmp\\file2json.txt");
        try {
        //    file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(json);
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
