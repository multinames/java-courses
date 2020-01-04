package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("Делай ставку");
            System.out.println("ВЫ проиграли, осталось " +money);
            money = money -10;
        }
        while (money >50);
    }
}
