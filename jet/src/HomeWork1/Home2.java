package HomeWork1;
// if else else if
public class Home2 {

    public static void main(String[] args) {
        int a=-10, b = 2, c = 0;

        System.out.println("Число "+a);


        if (a >= 0) {
            System.out.println(a+1);
        }
        else {
            System.out.println(a); }

        System.out.println("Число " +b);

        if (b >= 0) {
            System.out.println(b+1);
        }
        else {
            System.out.println(b-2); }

        System.out.println("Число " +c);

        if (c > 0) {
            System.out.println(c+1);
        }
        else if (c == 0) {
            c = 10;
            System.out.println(c);
        }
        else {
            System.out.println(c-2); }
    }
}
