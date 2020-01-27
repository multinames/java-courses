package HomeWork1;

import java.util.Collections;

// Массивы
public class Home5 {
    public static void main(String[] args) {
        HomeWork5 z1=new HomeWork5();
        System.out.println(z1.maxArray(new int[]{2, 31,84,55, 26, 7}));
        z1.sortArray(new int[]{2,3,4,5,6,7});
        System.out.println("");
        z1.indexZnPol(new int[]{-2,-4,-4,5,6,7});
        System.out.println("Сумма положительных элементов массива = "+z1.summPos(new int[]{-2,-3,4,5,6,7,0}));
        System.out.println("Сумма четных отрицательных элементов массива = "+z1.summNeg(new int[]{-2,3,4,-6,6,7}));
        System.out.println("Количество положительных элементов массива = "+z1.colNeg(new int[]{-2,3,4,-6,6,7}));
        z1.midArray(new int[]{-2,3,4,-6,6,7});
    }
}

class HomeWork5 {
    //Найти максимальное значение массива
    public int maxArray(int[] arr){
        int max=0;
        for (int i=0; i<arr.length;i++)
              {
                  if (arr[i] > max) {
                      max=arr[i];
                  }
                 // System.out.println(arr[i]);
        }
        System.out.print("Максимальное значение массива - ");
        return max;
    }
//Переставить элементы массива в обратном порядке

    public void sortArray(int[] arr){

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--)
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.print("Элементы массива в обратном порядке ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
// Найти индекс и значение первого положительного элемента массива
    public void indexZnPol(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i] >0 ) {
                System.out.println("Первый положительный элемент массива " +arr[i] +" с индексом "+i);
                break;
            }
        }
    }

    //Найти сумму положительных элементов массива
    public int summPos(int[] arr) {
        int summ = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] >0 ) {
                summ=summ+arr[i];
            }
        }
        return summ;
    }

    //Найти сумму четных отрицательных элементов массива

    public int summNeg(int[] arr) {
        int summ = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] <0 && (arr[i]%2)==0  ) {
              summ=summ+arr[i];
            }
        }
        return summ;
    }
    //Найти количество положительных элементов массива
    public int colNeg(int[] arr) {
        int col = 0;
        for (int i=0; i< arr.length; i++) {
            if (arr[i] > 0) {
                col=col+1;
            }
        }
        return col;
    }

    // Найти среднее арифметическое отрицательных элементов массива и заменить на него минимальное значение массива.

    public void midArray(int[] arr) {
        int s=0, col = 0;
        for (int i=0; i < arr.length;i++) {
            if (arr[i] <0) {
                s+=arr[i]; col++;
            }
        }
        System.out.println("Среднее арифметическое отрицательных элементов массива = " + (s/col));

        int min =arr[0]; int j=0;
        for (int i =0; i< arr.length ; i++) {
            if ( min > arr[i]) {
                min = arr[i]; j=i;
            }
        }
        arr[j]=s/col;
        System.out.print ("Минимальное число "+min +", на позиции, "+j+" заменно на "+arr[j]);

    }
}