package Lesson4;

import java.util.*;


public class Collection4{
        public static void main(String[] args) {

            /*String string = "Hello, World";
            StringBuilder builder = new StringBuilder();
            builder
                    .append("Hello")
                    .append(", ")
                    .append("World");

            String str = builder.toString();

            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer
                    .append("Hello")
                    .append(", ")
                    .append("World");
            String str2 = stringBuffer.toString();

*/
         /*   Human h1 = new Human("Artem");
            Human h2 = new Human("Sergey");
            Human h3 = new Human("Alexey");

            Map<Human,Integer> map = new TreeMap<>();
            map.put(h1,1234);
            map.put(h2,4321);
            map.put(h3,1111);

            System.out.println(map.size());

           System.out.println(map.get(h2));*/

       /*     Map<Integer, String> map = new HashMap<>();

            map.put (1,"Artem");
            map.put (2,"Artem");
            map.put (3,"Sergey");
            System.out.println(map.size());

            map.put(3,"asaddfgfg");

            System.out.println(map.get(3));

            for (Integer key: map.keySet()) {
                System.out.println(key);
            }

            for (String value: map.values()) {
                System.out.println(value);
            }

            for (Map.Entry<Integer, String> value: map.entrySet()) {
                System.out.println(value);
            }
*/

            // Set<String>set = new LinkedHashSet<>();
            // Set<String>set = new HashSet<>();
            // Set<String>set = new TreeSet<>();
/*            set.add("Artem");
            set.add("Viktor");
            set.add("Sergey");
            set.add("Dasha");
            set.add("Elena");
            set.forEach(s-> System.out.println(s));*/

/*
            Set<Human> humans = new TreeSet<>();
            humans.add(new Human("Artem"));
            humans.add(new Human("Artem"));
            humans.add(new Human("Sergey"));

            humans.forEach(s-> System.out.println(s));
*/




         /*   List<String> list = new ArrayList<>();


            list.add("Артем");
            list.add("Артем");
            list.add("Сергей");

            System.out.println(list.size());*/

          /*  Set<String> set = new HashSet<>();
            set.add("Артем");
            set.add("Артем");
            set.add("Сергей");
            System.out.println(set.size());

            Human h = new Human("Name");

            Set<Human> humans = new HashSet<>();
            humans.add(new Human("Artem"));
            humans.add(new Human("Artem"));
            humans.add(new Human("Sergey"));

            System.out.println(humans.size());
*/
        }
    }


final class Human implements Comparable<Human> {
// final class Human {

//    private final String name;
    private  String name;

    public Human(String name) {
        this.name = name;
    }
    public String getName (){
        return this.name;
    }
   /* public void setName(String name) {
        this.name = name;
    }
*/
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        if (o instanceof Human) {
            return this.name.equals(((Human)o).name);
        }
        return false;
    }

     @Override
    public int compareTo(Human o) {
        return this.name.compareTo(o.name);
    }

/*    @Override
    public String toString() {
        return this.name;
    }*/
}