package Lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class JsonParser {
    public static void readJson(String s) {
        try(InputStream in = new FileInputStream(s)){
            ObjectMapper objectMapper = new ObjectMapper();
            People people = objectMapper.<People>readValue(in, People.class);
            System.out.println(people);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}


