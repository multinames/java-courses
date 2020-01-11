package Lesson16;

// строки

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("privet");
        String s10 = s1.substring(3,4);
        System.out.println(s10);

        String s12 = s1.trim();
        System.out.println(s12);
        System.out.println(s1.length());
        System.out.println(s1.substring(3,3));

        String s14 = s1.replace('r', 'Z');
        System.out.println(s14);
        String s15 = s1.replace("vet","vivka");
        System.out.println(s15);

        String s5 = "privet";
        String s6 = "drug";
        System.out.println(s5.concat(s6));

    }
}
