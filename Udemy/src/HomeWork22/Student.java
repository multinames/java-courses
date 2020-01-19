package HomeWork22;

// Инкапсуляция
// Вывод данных о студенте через методд showInfo

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public void setName(StringBuilder s) {
        if (s.length() >3) {
        name =s;}
    }

    public StringBuilder getName () {
        return name;
    }

    public void setCourse (int i){
        if (i < 5 && i> 1) {
            course =i;
        }
    }

    public int getCourse (){
        return course;
    }

    public void setGrade (double i){
        if (i < 11 && i> 1) {
            grade =i;
        }
    }

    public double getGrade (){
        return grade;
    }

    public void showInfo(StringBuilder n, int i, double j) {
        System.out.println("студент: " +getName() +", курс : " + getCourse() + ", оценка: " + getGrade());
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName(new StringBuilder("Иван"));
        st1.setCourse(2);
        st1.setGrade(12);

        st1.showInfo(st1.getName(),st1.getCourse(),st1.getGrade());

    }
}