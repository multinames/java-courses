package Lesson22.p1;

import Lesson22.NewHuman;

public class Student extends NewHuman {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(salary);
        s.work();
        Student.rest();
    }

}
