package HomeWork10.p4;

import HomeWork10.p1.A;
import static HomeWork10.p1.p2.B.*;
import HomeWork10.p1.p2.p3.C;
import HomeWork10.p1.p2.B;
import HomeWork10.p4.p5.E;

public class D {
    public static void main(String[] args) {
        A a3 = new A();
        B b1 = new B();
        C c1 = new C();
        E e2 = new E();


        a3.showA("Forward"); // ваывод строки из А-класса
        b1.infoB(2020); // вызов метода пременной из B-класса
        System.out.println(st1); // вывовд статической пременной из В-класса
        c1.showC(); // Вывод значения метода C-класса
        e2.eShow(); // Вывод значения метода E-класса

    }
}
