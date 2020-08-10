package com.company;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {

    public static void main(String[] args) {
        String line = "value=\"ОВД ВЫХИНО\" ";
        String pattern = "ОВД ВЫХИНО";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);

        if(m.find()) {
            System.out.println("Found value: "+m.group(0));

        }else {
            System.out.println("NO MATCH");
        }

    }
}
