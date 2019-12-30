package HomeWork10.p4;

import HomeWork10.p1.A;
import static HomeWork10.p1.p2.B.st1;
import HomeWork10.p1.p2.B;
import HomeWork10.p4.p5.E;

public class D {
    public static void main(String[] args) {
        B b1 = new B();
        E e2 = new E();
        A a3 = new A();

        a3.showA("Forward"); // ваывод строки из А-класса
        b1.infoB(2020); // вывовд пременной из B-класса
        System.out.println(st1); // вывовд статической пременной C-класса
        e2.eShow(); // Вывод значения метода E-класса

    }
}
