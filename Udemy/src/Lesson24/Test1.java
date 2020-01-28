package Lesson24;

// Abstract classes

public class Test1 {
    public static void main(String[] args) {

        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvoStoron);

    }
}

abstract class Figura {
    int kolichestvoStoron;

    abstract void perimetr();

    abstract void ploshad ();

    void showInfo(){
        System.out.println("Это фигура");
    }

}

class Kvadrat extends Figura{
      int kolichestvoStoron =4;
      int storona1 =10;
    public void perimetr(){

        System.out.println("Периметр квадрата = "+4*storona1);
    }
    public void ploshad(){
        System.out.println("Площадь квадрата ="+storona1*storona1);

    }
}

class Pryamougolnik extends Figura{
    int kolichestvoStoron =4;
    int storona1=8;
    int storona2=5;

    public void  perimetr(){
        System.out.println("Периметр прямоугольника = "+2*(storona1+storona2));
    }
    public void ploshad() {
        System.out.println("Площадь квадрата =" + storona1 * storona2);
    }
}

class Okruzhnost extends Figura {
    int kolichestvoStoron =0;
    int radius = 3;

    public void  perimetr(){
        System.out.println("Периметр прямоугольника = "+2*3.14*radius);
    }
    public void ploshad() {
        System.out.println("Площадь квадрата =" +3.14*radius*radius);
    }
}

abstract class CheryrehUgolnik extends Figura{
    void def (){
        System.out.println("Это четрыхугольник");
    }
        }