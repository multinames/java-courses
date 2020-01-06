package Lesson18;
// Методы String
public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
    /*    String s= new String(array);
        System.out.println(s);*/
    StringBuilder sb1 = new StringBuilder("Hello World");
    // sb1.append(array,2,3);
        sb1.insert(2,array,1,3);
        System.out.println(sb1);
    }

}
