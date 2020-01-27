package Lesson2;

import Lesson2.log.Calculator;
import Lesson2.log.Logger;
import Lesson2.log.LoggerFactory;

public class App {
    public static void main(String[] args)  {

        Logger logger = LoggerFactory.getLogger();
        Calculator cacl = new Calculator(logger);

      /*  Employee emp = new Employee();
        emp.say();*/

      //  B b = new B();

 /*      Movable animal = new Dog();


        Dog d1 = (Dog)animal;
        d1.say();*/



    }
}

class People {

   protected String name;
   protected int age;

   public People(){}

   public People(String name, int age) {
       this.name = name;
       this.age =age;
   }

   public void  say (){
       System.out.println("Say something...");
   }

}

class Employee extends People{

    private double salary;

    public Employee (){}

    public Employee (String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }

    @Override
    public void say() {
        super.say();
        System.out.println("Employee say something...");
    }

    public double getSalary() {
        return this.salary;
    }

}