package Lesson22;

public class Test3 {
    void uvelichenieZP(Employee e) {
        e.salary = e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name="Иван";
        doc.age=50;
        doc.experience = 15;
        doc.eat();
        // doc.specializaciya="hirurg";
        doc.sleep();
        doc.lechit();

    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat (){ System.out.println("Кушать");}
    void sleep (){System.out.println("Спать");}
}
class Doctor extends Employee{
    void lechit(){System.out.println("Лечить");}
}

class Xirurg extends Doctor {
    String  skalpel;
    void  operacia(){

    }
}

class Dantist extends Doctor {

}
class  Teacher extends Employee{
    int kolichestvoUchenikov;
    void uchit(){System.out.println("Учить");}
}

class Driver extends Employee{
    String nameCar;
    void drive(){System.out.println("Водит");}
}