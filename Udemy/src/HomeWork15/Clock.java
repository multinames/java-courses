package HomeWork15;

public class Clock {


    public static void time() { // Метод time, вывод часы, минуты, секунды
        int h =-1;

        OUTER: while (h<=5) {
            h++;
            int m = -1;
            MIDDLE: do {
                m++;
                if (h > 1 && m % 10 == 0) {
                    break OUTER;
                }
                int s = 0;

                INNER: while (s<60) {

                    if(s*h > m ) {continue MIDDLE;}

                    System.out.println(h + ":" + m + ":" + s);
                    s++;


                }
            }
            while ( m < 59);
        }
    }
    public static void main(String[] args) {
        time();
    }
}
