package HomeWork2;

public class Students {
    public static void main(String[] args) {
        Student st1 = new Aspirant();

        System.out.println(st1.getScholarship(5));

    }

}

class Student{
    String firstName, lastName, group;
    double averageMark;

    public int getScholarship(double averageMark){
        int grants=100;
        if (averageMark <5) { grants =80;}
        return grants;
    }
}

class Aspirant extends Student {
    String scWork;

    public int getScholarship(double averageMark) {
        int grants=200;
        if (averageMark <5) { grants =180;}
        return grants;
    }
}