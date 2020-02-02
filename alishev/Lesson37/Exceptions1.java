import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args)  {
        File file  = new File("alishev/Test1");
        /*try {
            Scanner scanner = new Scanner(file);
            System.out.println("Сканнер Алё!!!");
        } catch (FileNotFoundException e) {
            System.err.println("Нет филе");
        }*/
        try {
            ReadFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");;
        }
    }

    public static void ReadFile() throws FileNotFoundException {
        File file  = new File("alishev/Test1");
        Scanner scanner = new Scanner(file);


    }
}

