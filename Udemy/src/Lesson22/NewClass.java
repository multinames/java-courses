package Lesson22;

public class NewClass {

    int age=18;

    public int putAge(){
        return age;
    }

}

class Test {
    public static void main(String[] args) {
        NewClass chel = new NewClass();
        System.out.println(chel.putAge());
    }


}