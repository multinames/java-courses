package Lesson6;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader6 {

    public static void main(String[] args) {
        File file = new File("./");
       // String[] files = file.list();

     //   File[] files = file.listFiles();

        try(CloseApp ca= new CloseApp()) {

        }catch (Exception ex) {
            ex.getMessage();
        };

        //writeBytesToFiles();
        readBytesFromFile();
/*
        byte[] arr = {1,10,-2,20,15,-100};
        InputStream is = new ByteArrayInputStream(arr);*/

     /*   int x=0;
        try { // чтение из потока
            while ((x = is.read()) != -1) {
                System.out.println(x);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }
*/
    //   byteOutputStream ();

        /*for (File str: files) {
            if(str.isDirectory() && str.canWrite()) {
                System.out.println(str.getAbsolutePath()+str.getName());
            }
        }*/


      //  Arrays.stream(files).forEach(item -> System.out.println(item));
    }

    public static void readBytesFromFile() {
        try (InputStream is = new FileInputStream("data")) {
            int x =0;
            while (( x = is.read()) !=-1 ){
                System.out.println((byte)x);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBytesToFiles () {
        byte[] arr = {100, -100, 50, -27, 43, 89};
        OutputStream out =null;

        try {
            out = new FileOutputStream("data",true);
            out.write(arr);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

        private static void byteOutputStream() { // Передача в поток
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // запсали в поток
            baos.write(254);
            baos.write(255);

            // прочитали из потока

            byte[] arr = baos.toByteArray();
            for (byte b : arr) {
                System.out.println(b);
            }
        }

    }

