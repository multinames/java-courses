package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        System.out.println("Попытка запуска сервера");
        try(ServerSocket serverSocket = new ServerSocket(10000)){
            System.out.println("Сервер запущен и ждет соединений");
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream(); //1
            InputStreamReader inr = new InputStreamReader(in); //2
            BufferedReader br = new BufferedReader(inr); //3

            while (!br.ready()){
                Thread.sleep(50);
            }


            String str = "";
            while ((str = br.readLine()) !=null){
                System.out.println(str);
            }



            OutputStream out = socket.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));
            BufferedReader reader = new BufferedReader(new FileReader("./Response"));

            String str2 = "";
            while ((str2 = reader.readLine()) != null){
                bw.write(str2);
                bw.flush();
            }

            System.out.println("Сервер завершил работу");
        }catch (IOException | InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}