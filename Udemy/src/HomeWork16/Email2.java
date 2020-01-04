package HomeWork16;

public class Email2 {
    int a =0;
    int i=3;

    public void mail (String s) {
        a = s.indexOf('@', i);
        System.out.println(a);
    }

    public static void main(String[] args) {
        Email2 e1 = new Email2();
        e1.mail("ya@yahoo.com; on@mail.ru;  ona@gmail.com;");

    }

}
