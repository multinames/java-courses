package HomeWork17;

public class Test1 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean b = false;
        b=sb1.equals(sb2);
        return b;

    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        // StringBuilder sb2 = sb1;
        StringBuilder sb2 = new StringBuilder("Hello");;
        System.out.println(ravenstvo(sb1,sb2));


    }
}
