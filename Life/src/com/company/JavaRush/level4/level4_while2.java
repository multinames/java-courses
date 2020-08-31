package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class level4_while2 {
    public static void main(String[] args) {

       // List<String> input = new ArrayList();
        Scanner scan = new Scanner(System.in);
        while(true){
            String current = scan.nextLine();
            if(current.equals(""))break;
            System.out.println(current);
        }

    }
}
