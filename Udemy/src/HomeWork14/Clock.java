package HomeWork14;

public class Clock {
    public static void time () { // Метод time, вывод часы, минуты, секунды
        OUTER: for (int h=0;h<=5;h++){
            // System.out.println("Начала outer loop");
            MIDDLE: for (int m=0; m<60; m++){
                if (h > 1  && m % 10 == 0) { break OUTER;}

                 INNER:for (int s=0;s<60;s++) {
                    //if(s*h > m ) {continue MIDDLE;}

                    System.out.println(h + ":" + m + ":"+s);

                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
