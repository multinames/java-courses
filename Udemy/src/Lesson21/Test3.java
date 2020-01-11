package Lesson21;

public class Test3 {
    Test3() { // Это конструктор
        System.out.println("Создался объект");
    }
    void Test3 (){ //Это метод
        System.out.println("Создался метод");
    }
    // int Test3 = 5;
    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();
    }
}
