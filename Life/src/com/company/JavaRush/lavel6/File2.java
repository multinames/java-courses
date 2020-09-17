package com.company.JavaRush.lavel6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) {
        String data = "Это тестовая строка для записи в файл";
        int noOfLines = 10;

        writeUsingBufferedWriter(data, noOfLines);

    }
    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("c://tmp//BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
