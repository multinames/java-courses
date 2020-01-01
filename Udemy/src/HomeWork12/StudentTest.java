package HomeWork12;

import Lesson11.Student;
import com.sun.deploy.security.SelectableSecurityManager;

public class StudentTest {

    static void sravnenie1(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course==s2.course && s1.grade==s2.grade) {
            System.out.println("Студенты идентичны");
            }
        else {
            System.out.println("Между студентами есть разница");
        }

    }

    static void sravnenie2(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена студентов, курсы и оценки одинаковы");

                } else {System.out.println("Имена студентов и курсы совпадают,но оценки разные");}

            } else {
                System.out.println("Имена студентов совпадают, но курс не совпдает");
            }
        }
        else {
            System.out.println("Имена студентов не совпадают");
        }

        }




    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 2, 6.9);
        Student st2 = new Student("Ivan", 2, 6.9);

        sravnenie1(st1, st2);
        sravnenie2(st1,st2);

    }
}
