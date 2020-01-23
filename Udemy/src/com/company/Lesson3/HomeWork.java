
package com.company.Lesson3;


public class HomeWork {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        
        long l = 20L;
        
        double result = 0;
        
        result = i2/d1 + d2%i1 - l;
        int a = 5;
        int b = 8;
        
        System.out.println(result);

        a = a-- - --a + ++a + a++ + a;
        
        b = ++b - b++ + ++b - --b;
                
        System.out.println(a);
        System.out.println(b);
    }
            
    
}
