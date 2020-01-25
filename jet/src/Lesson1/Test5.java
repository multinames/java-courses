package Lesson1;

public class Test5 {

    public static void main(String[] args) {
        System.out.println(Calendar.getMounth(0));;
    }
}

class Calendar {
    public static String getMounth(int value) {
        String result = "";
        switch (value) {
            case 0:
                result = "Январь";
                break;
            case 1:
                result = "Февраль";
            case 2:
                result = "Март";

            default:
                result ="Нет такого месяца";
        }
        return result;
    }
}