public class Test7 {
    public static void main(String[] args) {
        int arr[] = Arrays.createIntegerArray(20);
        arr[0] =10;

        for (int value : arr) {
            System.out.println(value);
        }
    }
}


class Arrays {

    private static int[] createIntegerArray(){
        return new int[10];
        }

    public static int[] createIntegerArray(int lenght){
        if(lenght < 0) {
            createIntegerArray();
        }
        int arr []= new int[lenght];
        return arr;
    }

    public static int[] increaseArray (int[] array, int lenght) {
        throw new UnsupportedOperationException();
    }

    public static boolean delete (int indx) {
        throw new UnsupportedOperationException();
    }
}
