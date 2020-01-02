package HomeWork13;

public class Month {

    public static void month2015 (int m){
        switch (m) {
            case 1:
            case 3:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31 день");
                break;
            }
            case 2: {
                System.out.println("28 дней");
                break;
            }

            case 4:
            case 6:
            case 9:
            case 11:
            {
                System.out.println("30 дней");
                break;
            }
        }
    }

    public static void main(String[] args) {
        month2015(4);
    }
}
