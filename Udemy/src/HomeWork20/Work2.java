package HomeWork20;

public class Work2 {

    public static void min(int[] array) {
        int min = array[0];
        for (int i =0; i< array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
            else continue;
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int [] array = {4, 3, 2, 1,-2,23,-10,0};
        min(array);
    }
}
