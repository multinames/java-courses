package Lesson17;

// StringBuilder

class Car {

}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // 16 - вместимость по дефаулту
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50); // 50 - вместимость
        StringBuilder sb4 = new StringBuilder(sb3); //
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf("o",2));

        String s = sb2.substring(5);
        System.out.println(s);
        String s2 = sb2.substring(5,8);
        System.out.println(s2);
        System.out.println(sb2.subSequence(5,8));

        System.out.println(sb2.insert(4,55));

        StringBuilder sb10 = new StringBuilder("Hello World");
        System.out.println(sb10.delete(3,6));
        System.out.println(sb10.deleteCharAt(10));



 /*       sb2.append(22);
        System.out.println(sb2);
        sb2.append(true);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        sb2.append(new Car());
        System.out.println(sb2);*/

    }
}
