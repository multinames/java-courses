package Lesson15;

public class Test9 {
    public static void main(String[] args) {
        int h = -1;

        OUTER:
        do {
            h++;
            int m =0;

            INNER: while(m <60) {
                if (m==20) continue OUTER;
                System.out.println(h+":"+m);
                m++;
            }


        }
        while (h<24);
    }
}
