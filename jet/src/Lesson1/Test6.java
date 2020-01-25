package Lesson1;

public class Test6 {
    public static void main(String[] args) {
        Iterable.printValues();
    }
}

class Iterable {
    public static void printValues(){
/*        for (int i=9; i>=0; i--) {
            System.out.println(i);*/

    int i =10;
    while (i<100){
        System.out.println(i);
            i++;

        }
    }
}