package com.company.YandexTasks.Files;

public class While {

    public static void main(String[] args) {
        int i=0, j=0;

        while(i<10) {
            while (j <10) {
                System.out.print(j +" ");
                j++;
            }

            System.out.print(i);
            i++;
        }
        System.out.println("count j: "+j);
        System.out.println("count i: "+i);
    }

}
