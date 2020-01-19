package Lesson23;

// Overriding method

public class Test3 {
    public static void main(String[] args) {
        Employee23 emp1 = new Employee23();
        Teacher23 t = new Teacher23();
        emp1.eat();
        t.eat();
    }
}

class Eda{}
class   Frukti extends Eda{}

class Employee23 {
    double salary = 100;
    String name;
    int age;
    int experience;

    Eda eat (){ System.out.println("Кушает работник");
    Eda e = new Eda();
    return e;
    }

    void sleep (){System.out.println("Спать");}
}

class  Teacher23 extends Employee23{
    int kolichestvoUchenikov;

    Frukti eat (){ System.out.println("Кушает учитель");
        Frukti f = new Frukti();
        return f;
    }

    void uchit(){System.out.println("Учить");}
}