package Lesson14;
// clock
public class Test66 {
    public void time () {
        OUTER: for (short h=0;h<=23;h++){
            System.out.println("Начала outer loop");
            INNER: for (short m=0; m<=59; m++){
                System.out.println(h+":"+m);
                if (m==30) {break INNER;}
            }

            System.out.println("Конец outer loop");


        }
    }

    public static void main(String[] args) {
        Test66 t = new Test66();
        t.time();
    }
}
