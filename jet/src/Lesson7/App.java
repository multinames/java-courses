package Lesson7;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    //   writeToFile();
      ///  readAllFromFile();
        readPage("lor.txt");
    }

    private static void readPage(String fileName) {
        try(
                RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            ){ byte [] arr = new byte[1000];
            raf.seek(1000);
            raf.read(arr);
            Reader reader = new InputStreamReader(new ByteArrayInputStream(arr));
            int x;
            while ((x = reader.read()) != -1) {
                    System.out.print((char)x);

                }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Метод читает из файла
    private static void readAllFromFile(){

        try(
        InputStream is = new FileInputStream("1.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is))
        ){
            String str = null;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static  void readFromFile(){
        try(Reader reader = new FileReader("1.txt")) {
            int ch = 0;
            while((ch = reader.read()) != -1) {
                System.out.println((char) reader.read());
            }
        }catch (IOException ex) {
            ex.getMessage();
        }
    }
// Метод записывает строку из консоли в файл
    private static void writeToFile(){
        String console = scanConsole();
        try ( Writer writer = new FileWriter("1.txt",true);){

            writer.write(console); // Пишет в файл
            writer.write("\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
// метод считывающий строку из консоли
    private static String scanConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        return  sc.nextLine();
    }
}
