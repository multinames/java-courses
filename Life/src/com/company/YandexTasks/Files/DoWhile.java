package com.company.YandexTasks.Files;
/*
На вход приходит большой файл (в оперативную память не влезет). Создайте новый файл, удалив в исходном
повторяющиеся строки. Порядок строк в выходном файле не важен.
 */
import java.io.*;

public class DoWhile {
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

                // Читаем втророй файл
                //  FileReader fileReader2 = new FileReader(file2);
//           BufferedReader reader2 = new BufferedReader(fileReader2);

                // Читаем первую строку
                String fline1 = reader1.readLine();
                //      String fline2 = reader2.readLine();

                int count1 = 0;
                int count2 = 0;

                //первый цикл для чтения первого файла

                while ( fline1 != null) {
                    count1++;
                    //открываем второй файл
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader reader2 = new BufferedReader(fileReader2);
                    String fline2 = reader2.readLine();

                    //второй цикл для чтения второго файла
                 do {
                        count2++;

                        System.out.println(fline1 + " " +fline2);
                        // Если строка из первого файла равна строке из второго, то читаем дальше из
                        // второго файла, пока не конец цикла
                        if (fline1.equals(fline2)) {
                            System.out.println("Совпадение");

                        } else //иначе пишем строку из первого файла во второй и выходим из второго цикла
                         {
                            System.out.println("Нет совпадения!!");
                            appendFile("c:\\tmp\\file2.txt",fline1);
                             break;
                        }
                     fline2 = reader2.readLine();
                    }while (fline2 != null); // читаем пока не конец второго файла

                    fline1 = reader1.readLine();
                    //fline2 = reader2.readLine();

                }


                System.out.println("Итераций первого цикла: " +count1);
                System.out.println("Итераций второго цикла: " +count2);






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


