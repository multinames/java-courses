package HomeWork1;

import java.util.Collections;

// Массивы
public class Home5 {
    public static void main(String[] args) {
        HomeWork5 z1=new HomeWork5();
        System.out.println(z1.maxArray(new int[]{2, 31,84,55, 26, 7}));
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
}