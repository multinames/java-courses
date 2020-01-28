package HomeWork2;

public class Person {
    String fullName;
    int age;
// конструкторы

    public Person (){}

    public Person (String fullName, int age){
        this.fullName = fullName;
        this.age = age;

    }
// методы
    public void talk(String fullName){
        this.fullName = fullName;
        System.out.println(fullName +" говорит");
    }

    public void move(String fullName) {
        this.fullName = fullName;
        System.out.println(fullName +" перемещается");
    }

}
class TestPerson{

    Person p1 = new Person();
    Person p2 = new Person("Иванов Иван Иванович", 45);

}
