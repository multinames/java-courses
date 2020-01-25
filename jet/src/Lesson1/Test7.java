package Lesson1;

public class Test7 {
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE);
      //  int arr[] = Arrays.createIntegerArray(20);
        //arr[0] =10;

      //  int arr []=  {1,2,3,4,5,6,7,8,10};

        int arr1 []=  {11,22,32,14,52,16,72,81,10};

      /*  for (int i=0;i <arr1.length;i++) {
            System.out.print(arr1[i] +" ");}
*/
        /*for (int value : arr) {
            System.out.println(value);
        }*/

        Arrays.sortirovka(arr1);

        System.out.println(java.util.Arrays.toString(arr1));

        // System.out.println(Arrays.sortirovka(arr1));

      //  System.out.println(Cacl.evenElement(arr));
    }
}

class Cacl{
    public static int evenElement(int arr[]) {

        int result =0;

         for (int i=0; i<arr.length;i++) {
             if(i %2 ==0) {
                 result= result + arr[i];
             }
         }
         return result;
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
}
