package Lesson13;

public class Employee {

    public static void main(String[] args) {

        byte dayOfWeek = 2;

        final int a = 1;
        final int b = 2;

        switch (dayOfWeek*3) {
            case 1:

            case a*b:

            case 3:
            case 4:
            case 5:
                System.out.println("Работа до 18:00");
                break;
            default:
                System.out.println("Такого дня не существует");

        }
    }
}
