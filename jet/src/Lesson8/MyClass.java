package Lesson8;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyClass {
    @JsonProperty
    private String className;
    @JsonProperty
    private String classLevel;
    private People people;

    public MyClass(){}

    public MyClass (String className, String classLevel, People people) {
        this.className = className;
        this.classLevel = classLevel;
        this.people = people;
    }

    public String getClassName() {
        return className;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public People getPeople() {
        return people;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "className='" + className + '\'' +
                ", classLevel='" + classLevel + '\'' +
                ", people=" + people +
                '}';
    }
}
