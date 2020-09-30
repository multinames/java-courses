package com.company.YandexTasks;

import java.util.Arrays;

public class Sort {

        public static void main(String[] args) {
            int [] arr = {11, 3, 14, 16, 7};

            boolean isSort = false;
            int num;
            
            while(!isSort) {
                isSort = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i] > arr[i+1]){
                        isSort = false;
                        num = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = num;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
}
