package Lesson13;

public class Test1 {

}

class Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);
        switch (st1.grade) {
            case 2:
                System.out.println("Двоешник");
                //break;
            case 3:
                System.out.println("Троешник");
                break;

            case 4:
                System.out.println("Хорошист");
                break;
            case 5:
                System.out.println("Отличник");
                break;
            default:
                System.out.println("Оценка не верна");
        }
    }

        }