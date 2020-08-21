package com.company.JavaRush;

public class Artifact {
    int number;
    String culture;
    int age;

    public Artifact (int number) {
        // Конструктор. Только номер в каталоге
        this.number = number;
    }

    public Artifact (int number, String culture) {
        //Конструктор. Номер и культура.
        this.number = number;
        this.culture = culture;
    }

    public Artifact (int number, String culture, int age) {
        // Конструктор. Номер, культура, век
        this.number = number;
        this.culture = culture;
        this.age = age;
    }

    public static void main(String[] args) {
        // создаем экземпляры
        Artifact artifact1 = new Artifact(123);
        Artifact artifact2 = new Artifact(231, "Майя");
        Artifact artifact3 = new Artifact(1231,"Инка",12);
    }
}
