package com.company.Lesson5.HomeWork;

// Счет в банке

public class BankAccount {
    // Переменные объекта
    int idClient;
    String nameClient;
    double balanceClient;

    // метод добавления денег на счет в банке
    double popolneneiScheta(double currBalance, double summaPlus){
        double NewBalance = summaPlus + currBalance ;
        System.out.println("-> Поступление на счет: " + summaPlus);
        return NewBalance;
    }

    // метод снятия денег со счета в банке
    double snyatieSoScheta(double currBalance, double summaMinus){
        double NewBalance = currBalance - summaMinus;
        System.out.println("<- Снятие со счета: " + summaMinus);
        return NewBalance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount bA = new BankAccount(); // создаем нового клиента

        bA.idClient = 100;
        bA.nameClient = "Sergei";
        bA.balanceClient = 1002.35;

        System.out.println("Исходящий остаток: " + bA.popolneneiScheta(bA.balanceClient, 25));

        System.out.println("Исходящий остаток : " + bA.snyatieSoScheta (bA.balanceClient, 100));
    }
}
