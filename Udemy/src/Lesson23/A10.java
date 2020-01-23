package Lesson23;

// super

public class A10 {
    String s1 = "Привет";
    static double d1 = 3.14;

    int summa (int ... i) {
        int result = 0;
        for (int a:i) {
            result+=a;
        }
        return result;
    }

    void abc(){
        System.out.println("static method");
    }
}

class B10 extends A10 {

  //  String s1 = super.s1 + " drug!";
    boolean s1 = true;

    int summa (int ... i) {
        int result = super.summa(i);

        System.out.println("Сумма: " +result);
        return result;
    }

    public static void main(String[] args) {
    B10 b = new B10();
        System.out.println(b.s1);

    }

}