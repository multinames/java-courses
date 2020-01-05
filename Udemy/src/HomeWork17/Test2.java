package HomeWork17;

public class Test2 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean b=true;
        for (int i=0; i<=sb1.length()-1;i++){
            if (sb1.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return b;
    }
}

class Test2Test{
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("hello");
        //StringBuilder sb2 = sb1;
        System.out.println(Test2.ravenstvo(sb1,sb2));
    }
}