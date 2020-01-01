package Lesson12;

public class Test10 {

    static void  abc(){
        String  str;
        int a = 10;


        if (a >= 10) {
            str = "Hello"; }


        if (a < 10) {
            str = "Bye"; }

        else {
            str = null; }

        System.out.println(str);
    }

    public static void main(String[] args) {


        int a = 10;
        int b = 20;

        int maximum = (a>b) ? a:b;  //Ternary оператор.
        System.out.println(maximum);



    }


}


