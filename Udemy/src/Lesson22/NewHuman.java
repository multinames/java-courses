package Lesson22;

public class NewHuman {

/*    protected NewHuman(String n){
        name =n;
    }*/
    protected String name = "Колян";

/*    public String getName (){return name;}
    public void setName (String n) {name =n;}*/

    protected static int salary = 150;

    protected void work(){
        System.out.println("Работать");
    }
    protected static void rest (){
        System.out.println("Отдыхать");
    }

}

class Student extends NewHuman{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }


}