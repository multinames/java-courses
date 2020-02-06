package HomeWork8_json;

import HomeWork8_json.JsonParser;
import HomeWork8_json.People;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        List<People> people_one = new ArrayList<>();
        people_one.add(new People("Artem",10));
        people_one.add(new People("Viktor",11));

        List<People> people_two = new ArrayList<>();
        people_two.add(new People("Alexey",14));
        people_two.add(new People("Sergey",14));

        List<People> people_three = new ArrayList<>();
        people_three.add(new People("Alexey",14));
        people_three.add(new People("Sergey",14));

        Map<Keys, List<People>> map = new LinkedHashMap<>();
        map.put(Keys.ONE, people_one);
        map.put(Keys.TWO, people_two);
        map.put(Keys.TWO, people_three);

/*
        people.add(new People("Artem",11));
        people.add(new People("Viktor",56));
        people.add(new People("Sergey",45));
*/

       //JsonParser.<Map<Keys,List<People>>>readJson((Class<Map<Keys, List>>,"peoplelist.json");
       //JsonParser.<List<People>>writeToJson(people_two,"peoplelist.json");


        //List <People> people = new ArrayList<>();

        // JsonParser.<List<People>>readJson((Class<List<People>>) people.getClass(),"peoplelist.json");

    }


}
