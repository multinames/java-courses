package com.company.YandexTasks.Files;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFile {

        public static void main(String[] args) {
            try {
                String filePath = "c:\\tmp\\file1.txt";


                System.out.println(readStringFromFile(filePath));

               // writeData(filePath, "Data", 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // метод для записи данных в файл
        private static void writeData(String filePath, String data, int seek) throws IOException {
            // открываем файл с возможностью как чтения, так и записи
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");
            // переходим на определенный индекс
            file.seek(seek);
            // запишем данные в этом месте
            file.write(data.getBytes());
            file.close();
        }

        // метод для чтения с файла
        private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
            // открываем файл только для чтения
            RandomAccessFile file = new RandomAccessFile(filePath, "r");
            file.seek(seek);
            byte[] bytes = new byte[chars];
            file.read(bytes);
            file.close();
            return bytes;
        }
        private static String readStringFromFile(String filePath) throws IOException {
            // открываем файл только для чтения
            RandomAccessFile file = new RandomAccessFile(filePath, "r");
            //file.seek(seek);
            String st = new String();
           st=file.readLine();
            file.close();
            return st;
    }

    }
