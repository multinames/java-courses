package com.company.Lesson5;

// Создание метода

public class Test20 {  // Шаблон метода. Описываем логику.
    int summa(int a, int b, int c) {  // Метод summa, возрващает целое число
        int result = a + b + c;
        return result; // вывод результата; последняя строка метода
    }

    int sredneeArifm(int a1, int b1, int c1) {  // вызов метода в методе
        int result2 = summa(a1, b1, c1)/3 ;
        return result2;
    }
}

class  Test21{ // реализация метода в новом классе
    public static void main(String[] args) {
        Test20 t = new Test20();
        int Summa3Chisel = t.summa(1,2,3);
        System.out.println(Summa3Chisel);
        System.out.println(t.summa(10,20,30));
        System.out.println(t.sredneeArifm(20,40,60));
    }

}
