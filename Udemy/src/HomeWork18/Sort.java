package HomeWork18;

public class Sort {

    public static void sortirovka(int [] array) {
        for (int i =array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int max = array[j];
                    array[j] = array[j+1]; //меняем местами
                    array[j+1] = max;      //два соседних элемента
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array={-3,0,5,2};
        sortirovka(array);

        for (int i=0;i <array.length;i++) {
            System.out.print(array[i] +" ");
        }
    }
}

