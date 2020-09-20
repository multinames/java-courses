package com.company.YandexTasks.Files;
/*
На вход приходит большой файл (в оперативную память не влезет). Создайте новый файл, удалив в исходном
повторяющиеся строки. Порядок строк в выходном файле не важен.
        */
import java.io.*;

public class File {
    public static void main(String[] args) throws IOException {
        try {
            java.io.File file1 = new java.io.File("c:\\tmp\\file1.txt");
            java.io.File file2 = new java.io.File("c:\\tmp\\file2.txt");
            //Проверка существования файла
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            // Читаем первый файл
            FileReader fileReader1 = new FileReader(file1);
            BufferedReader reader1 = new BufferedReader(fileReader1);
            // Читаем первую строку
            String fline1 = reader1.readLine();

            //Читаем второй файл
            FileReader fileReader2 = new FileReader(file2);
            BufferedReader reader2 = new BufferedReader(fileReader2);
            // Читаем первую строку
            String fline2 = reader2.readLine();


            while ( fline1 != null) {

                while(true) {
                    if (fline1.equals(fline2)) {

                        System.out.println(" есть совпадение " + fline1+ " " +fline2);
                        //fileReader2.close();
                    break;
                    }
                    else if (!fline1.equals(fline2)){
                        System.out.println(" нет совпадения у " + fline1+ " и " +fline2 +
                                " дописали строку " +fline1);
                        appendFile("c:\\tmp\\file2.txt", fline1);

                           //  fileReader2.close();
                       break;
                    }
                    //читаем следущую строку из второго файла
                    fline2 = reader2.readLine();
                }
                //читаем следущую строку из второго файла
                 fline1 = reader1.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendFile(String patch, String str) {
        //Переход на новую строку
        final String sp = System.getProperty("line.separator");

        java.io.File file = new java.io.File(patch);
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
}
