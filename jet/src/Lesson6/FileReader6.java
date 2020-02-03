package Lesson6;

import java.io.*;
import java.util.Arrays;

public class FileReader6 {

    public static void main(String[] args) {
        File file = new File("./");
        String[] files = file.list();
        Arrays.stream(files).forEach(item -> System.out.println(item));
    }
}