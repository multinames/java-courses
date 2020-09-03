package com.company.JavaRush.level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l4_sveta {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ph = reader.readLine();

        for (int i=0;i!=10;i++) {
            System.out.println(ph+" любит меня.");
        }
    }
}
