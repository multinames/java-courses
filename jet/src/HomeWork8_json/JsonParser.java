package HomeWork8_json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

class JsonParser {
    public static <T> void readJson(Class<T> clazz, String fileName) {
        try(InputStream in = new FileInputStream(fileName)){
            ObjectMapper objectMapper = new ObjectMapper();
            T object = (T)objectMapper.readValue(in, clazz);
            System.out.println(object);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


    public static<T> void writeToJson(T people, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        try (Writer writer = new FileWriter(fileName)) {
            String result = objectMapper
                    .writerWithDefaultPrettyPrinter()

                    .writeValueAsString(people);
            //System.out.println(result);
            writer.write(result);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}

