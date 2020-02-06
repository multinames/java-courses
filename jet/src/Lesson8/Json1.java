package Lesson8;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

public class Json1 {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, JsonParseException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        String json = "{\"name\":\"firstPerson\",\"age\":25,\"gender\":\"male\"}\n{\"name\":\"secondPerson\",\"age\":30,\"gender\":\"male\"}\n{\"name\":\"thirdPerson\",\"age\":25,\"gender\":\"male\"}";
        String[] jsons = json.split("\n");
        String output = "";

        for (String str : jsons) {
            output += objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectMapper.readValue(str, Object.class)) + "\n";
        }

        System.out.println(output);
    }
}

