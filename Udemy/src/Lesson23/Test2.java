package Lesson23;

public class Test2 {
        /*public Object abc () {
        return new int [] {1,2,3,4,5};  }*/

    public static void main(String[] args) {
        /*Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();*/

        Employee emp1 = new Doctor();

        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();

        Doctor d2 = new Xirurg();
        System.out.println(d2.experience);
        d2.eat();

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        // Xirurg x = new Xirurg();


        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();

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
class  Teacher extends Employee{
    int kolichestvoUchenikov;

    void uchit(){System.out.println("Учить");}
}

class Driver extends Employee{
    String nameCar;

    void drive(){System.out.println("Водит");}
}
