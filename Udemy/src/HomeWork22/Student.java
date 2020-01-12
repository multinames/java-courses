package HomeWork22;

public class Student {
    StringBuilder name;
    int course;
    double grade;

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s) {
        if (s.length() >3) {
        name =s;}
    }
}
