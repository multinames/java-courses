package HomeWork16;

public class Email {
    String mail;

    public void Email(String mail) {
        this.mail = mail;
        char c1;

        for (int i=0; i<mail.length();i++) {
            c1=mail.charAt(i);

            if (c1 !=';' && c1!='@') {
                // System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Email e1 = new Email();
        e1.Email("ya@yahoo.com; on@mail.ru;  ona@gmail.com;");

    }
}
