package Lesson6;

import java.io.*;

// сериализация
public class GameOver {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Player player = new Player();
        player.nickname="Sergey";
        player.level= 20;
       // save(player);
        Player player1 =load();
        System.out.println(player1.nickname+": "+player1.level);
    }
    public static void save (Player player) throws IOException {

        OutputStream out = new FileOutputStream("player");

        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(player);
        oos.close();
    };

    public static  Player load() throws IOException, ClassNotFoundException {
        InputStream in = new FileInputStream("player");
        ObjectInputStream ois = new ObjectInputStream(in);
        Player player =(Player) ois.readObject();
        return player;
    }
}
