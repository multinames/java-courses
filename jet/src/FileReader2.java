import java.io.*;

public class FileReader2 {
    public static void main(String[] args) {
        File file = new File("./jet/1.txt");
        try(BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            System.out.println(fileReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        }



/*      //  String[] structure = file.list();

        for (String str:structure) {
        System.out.println(str);
    }*/

   /* try {
        FileReader fl = new BufferedReader("file");
    }catch (FileNotFoundException ex) {
        System.out.println(ex.getMessage());
    }finally {
        try {
            fileReader.close
        }
    }*/


    }
}
