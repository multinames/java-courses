package HomeWork8_json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class People {
    @JsonProperty
    private String name;

    @JsonProperty
    private int age;

    public People(){}

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        //  this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
