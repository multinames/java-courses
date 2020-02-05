package HomeWork3;
// Напишите программу на Java, чтобы получить символ (кодовую точку Unicode) по указанному индексу в строке.
public class Home2 {
    public static void main(String[] args) {
        String str1 = "w3resource.com";
        System.out.println(str1.codePointAt(0));
        System.out.println(str1.codePointAt(2));
    }

}
