package com.company.YandexTasks.Files;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            String file1 = "c:\\tmp\\file1.txt";
            String file2 = "c:\\tmp\\file2.txt";

            RandomAccessFile fline1 = new RandomAccessFile(file1, "r");
            RandomAccessFile fline2 = new RandomAccessFile(file2, "rw");

                int count1 = 0;
                int count2 = 0;

                String st1="";
                String st2="";
                boolean flag = false;

                while (st1 != null) {

                   st1 = fline1.readLine();
                    System.out.println(st1);

                    while (st2 != null) {
                        st2 = fline2.readLine();
                        if (st1.equals(st2)) {
                            flag = true;
                            System.out.println("Совпадение "+ st1 + " "+st2);
                            break;
                        }

                        if (flag == false) appendFile("c:\\tmp\\file2.txt", st1);

                        else if (flag == true) flag = false;
                        fline2.seek(0);
                    }
                }

            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void writeData(String filePath, String data, int seek) throws IOException {
        // открываем файл с возможностью как чтения, так и записи
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        // переходим на определенный индекс
        file.seek(seek);
        // запишем данные в этом месте
        file.write(data.getBytes());
        file.close();
    }

    private static void appendFile(String patch, String str) {
        //Переход на новую строку
        final String sp = System.getProperty("line.separator");

        java.io.File file = new java.io.File(patch);
        FileWriter fr = null;

        try {
            fr = new FileWriter(file,true);
            fr.write(str+sp);

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

}
