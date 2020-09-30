package com.company.JavaRush;

public class Chet {

    public static void main(String[] args) {

        int[] array = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

      Duplicate(array);

    }

    static void Duplicate(int[] arr) {
        boolean[] done = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(done[i])
                continue;
            int nb = 0;
            for(int j = i; j < arr.length; j++) {
                if(done[j])
                    continue;
                if(arr[j] == arr[i]) {
                    done[j] = true;
                    nb++;

                }
            }
            System.out.println(arr[i] + " повторяется " + nb + " раз");
            }
        }
    }

