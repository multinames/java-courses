package com.company.JavaRush.lavel6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class countString {

    public static void main(String[] args) throws IOException {

        System.out.println(countStringInFile("c:\\tmp\\file1.txt"));

        }

        public static int countStringInFile(String patch) throws IOException {

            File file = new File(patch);
            FileInputStream fis = new FileInputStream(file);
            byte[] byteArray = new byte[(int)file.length()];
            fis.read(byteArray);
            String data = new String(byteArray);
            String[] stringArray = data.split("\r\n");

            return stringArray.length;

        }
}
