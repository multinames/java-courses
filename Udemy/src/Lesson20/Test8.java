package Lesson20;


import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {1,2,3,5};
        int [] array5 = {1,2,3,5};
        char [] array3 = {'p','r','i','v','e','t'};
        char [] array6 = {'p','r','i','v','e','t','o'};
        char [] array4 = {'p','r','i','v','i','v','k','a'};


      System.out.println(Arrays.mismatch(array1, array2));
    }

}
