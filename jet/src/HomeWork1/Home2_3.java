package HomeWork1;
// case
public class Home2_3 {
    public static void main(String[] args) {

        PhoneTalk t1= new PhoneTalk();
        System.out.println(t1.callCity(495) + " руб.");
        System.out.println(t1.callCity(194) + " руб.");
        System.out.println(t1.callCity(491) + " руб.");
        System.out.println(t1.callCity(800) + " руб.");

    }
}

class PhoneTalk{
    public double callCity(int code) {
        double result =0;
        double time = 10.0;
        switch (code) {
            case 495:
                result = time*4.15;
                System.out.print("Москва "+ time + " минут: ");
                break;
            case 194:
                result = time*1.98;
                System.out.print("Ростов "+ time + " минут: ");
                break;
            case 491:
                result = time*2.69;
                System.out.print("Краснодар "+ time + " минут: ");
                break;
            case 800:
                result = time*5.0;
                System.out.print("Киров "+ time + " минут: ");
                break;
        }
        return result;
    }
}