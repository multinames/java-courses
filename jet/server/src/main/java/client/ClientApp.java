package client;

import java.io.*;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) {
        System.out.println("Инициализация подключения к серверу");
        try(Socket socket = new Socket("localhost", 10000)){
            System.out.println("Соединение установлено");

            FileReader fileReader = new FileReader("httpPackage");
            BufferedReader reader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String str = "";
            while ((str = reader.readLine()) != null){
                stringBuilder.append(str);
            }

            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();

            OutputStreamWriter writer = new OutputStreamWriter(out);

            writer.write(stringBuilder.toString());
            writer.flush();
            socket.shutdownOutput();

            InputStreamReader inr = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inr);

            while (!bufferedReader.ready()){
                Thread.sleep(50);
            }
            String answer = "";
            while ((answer = bufferedReader.readLine()) != null){
                System.out.println(answer);
            }
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Соединение разорвано");
    }
}
