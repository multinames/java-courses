package com.company;

interface Viber1{

}

public class Viber implements Messenger {

    public void sendMessage() {

        System.out.println("Отправляем сообщение в Viber!");
    }

    public void getMessage() {
        System.out.println("Читаем сообщение в Viber!");
    }
}