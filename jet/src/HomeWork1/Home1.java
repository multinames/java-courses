package HomeWork1;

// Примитивные типы

public class Home1 {
    public static void main(String[] args) {
        int a = 69, b = 23456, c=891 ;

        System.out.println("Последняя цифра в "+a + " = "+a%10);
        System.out.println("Число десятков в "+a + " = "+a/10);
        System.out.println("Число десятков многозначного числа "+b + " = "+(b/10%10));
        System.out.println("Сумма цифр трехзначного числа " + c + " = "+ ((c/100)+(c/10%10)+(c%10)));
    }
}


