package Lesson23;

// Method Hidding

public class Test5 {
    public static void main(String[] args) {
        Employee5 ee = new Teacher5();
        Teacher5 t = new Teacher5();
        ee.sleep();
        

    }
}

class Employee5 {
    double salary = 100;
    String name;


    void eat (){ System.out.println("Кушать");}
    static void sleep (){System.out.println("Спит работник");}
}

class  Teacher5 extends Employee5{
    int kolichestvoUchenikov;

    void uchit(){System.out.println("Учить");}

    static void sleep (){System.out.println("Спит учитель");}
}