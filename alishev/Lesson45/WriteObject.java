import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Bob");
        Person p2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); // // Файл из которого будем читать
            ObjectOutputStream oos = new ObjectOutputStream(fos); // Преобразовывает в байты переданные объекты
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Write successful!");
    }
}
