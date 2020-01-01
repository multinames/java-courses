package Lesson12;

public class Test10 {
    public static void main(String[] args) {
        int salary = 1500;
        boolean b = true;

        if (salary <200) {
            System.out.println("Low!!!");
        }
        else if (salary <400 && b==false || !true ) {
            System.out.println("Midle");
        }
        else if (salary <600 ) {
            System.out.println("Good");
        }
        else {
            System.out.println("Very Good!!!");
        }




    }

}
