package com.company.YandexTasks.Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Arrays;

public class WriteJson {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create() ;

    public static void main(String[] args) {
        PersonToJSon person1 = new PersonToJSon(1, "Иван", Arrays.asList("Москва", "Дубай", "Токио","Жопа мира"));

        String json = GSON.toJson(person1);

        String json1 = null;
        try {
            json1 = readFromJson("c:\\tmp\\file2json.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //   System.out.println(json1[2]);

        PersonToJSon person2 = GSON.fromJson(json1,PersonToJSon.class);
        System.out.println(person2.getId());
         System.out.println(person2.getName());
         System.out.println(person2.getGeo());

  //      System.out.println(json);


            writeToFile(json,"c:\\tmp\\file2json.txt");
    }


    public static void writeToFile (String json, String patch) {
        File file = new File(patch);
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

    private static String readFromJson(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }


}
