package com.company.YandexTasks.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class toWrite {


    public static void main(String[] args) {

        appendFile("c:\\tmp\\file2.txt","Hello");
        appendFile("c:\\tmp\\file2.txt","Java!");


    }

    private static void appendFile(String patch, String str) {
        final String sp = System.getProperty("line.separator");
        java.io.File file = new java.io.File(patch);

       System.out.println("Файл "+ file.exists());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(str + sp);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeUsingFileWriter(String data) {
        final String sp = System.getProperty("line.separator");
        java.io.File file = new java.io.File("c:\\tmp\\file2.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data + sp);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeUsingBufferedWriter(String data) {
        java.io.File file = new java.io.File("c:\\tmp\\file2.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);

            br.write(dataWithNewLine);
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
