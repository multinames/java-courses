package HomeWork16;

public class Email1 {

    int i=0; // позиция символа ;
    int a=0; //позиция символа @
    int p=0; // позиция символа .


        public void Email(String s) {
        while (i < s.length()-1) {
        //    System.out.println(i);
            a = s.indexOf('@',i);
            p = s.indexOf('.',i);
            i = s.indexOf(';',i+1);


            System.out.println(s.substring(a + 1, p));
            System.out.println(i);

        }

    }

    public static void main(String[] args) {
        Email1 e1 = new Email1();
        e1.Email("ya@yahoo.com; on@mail.ru;  ona@gmail.com;");

    }
}
