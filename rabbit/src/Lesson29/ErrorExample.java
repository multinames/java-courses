package Lesson29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {

    private ABC abc = new ABC();

    public void foo()  {
        FileInputStream fileInputStream = null;
              try {
           fileInputStream = new FileInputStream(" ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //System.out.println(1/0);
        //int array [] = {1,2,3};
        //array[5]=5;

/*        try {
            abc.Show();
            System.out.println(1 / 0);

        } catch (NullPointerException | ArithmeticException ex) {
            ex.printStackTrace();
        }

    }*/
/*        if(abc == null) {
            System.err.println("Null pointer");
        } else {

        abc.Show();} */
    }
}
class TestErrorExample{
    public static void main(String[] args) {
        ErrorExample ex = new ErrorExample();
        try {
            ex.foo();
        } finally {

        }
    }
}