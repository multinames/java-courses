package Lesson8;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //   writeToFile();
        ///  readAllFromFile();
        // readPage("lor.txt");
        // JsonParser.readJson("people.json");

        /*People people = new People();
        people.setAge(20);
        people.setName("Artem");*/
     //    JsonParser.writeToJson(people, "output.json");

        List<People> people = new ArrayList<>();
        people.add(new People("Artem",11));
        people.add(new People("Viktor",56));
        people.add(new People("Sergey",45));

        JsonParser.<List<People>>writeToJson(people,"peoplelist.json");


        //List <People> people = new ArrayList<>();

       // JsonParser.<List<People>>readJson((Class<List<People>>) people.getClass(),"peoplelist.json");

    }

    private static void readJson(String s) {
        try(InputStream in = new FileInputStream(s)){
            ObjectMapper objectMapper = new ObjectMapper();
            People people = objectMapper.<People>readValue(in, People.class);
            System.out.println(people);
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
     }

}
