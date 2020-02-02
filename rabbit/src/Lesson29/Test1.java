package Lesson29;

public class Test1 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.err.println("На ноль делит нельзя");
        }
    }
}
