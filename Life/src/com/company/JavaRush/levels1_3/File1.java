package com.company.JavaRush.levels1_3;

import java.io.*;

public class File1 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("c:\\tmp\\file1.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String fline = reader.readLine();

            String str= "";

            while (fline != null) {
                str=fline;

                System.out.println(str);
                fline = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}