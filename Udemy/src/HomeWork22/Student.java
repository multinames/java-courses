package HomeWork22;

// Инкапсуляция
// Вывод данных о студенте через методд showInfo

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    private void setName(StringBuilder s) {
        if (s.length() >3) {
        name =s;}
    }

    private void setCourse (int i){
        if (i < 5 && i> 1) {
            course =i;
        }
    }

    private void setGrade (double i){
        if (i < 11 && i> 1) {
            grade =i;
        }
    }

    public void showInfo(StringBuilder n, int i, double j) {
        setName(n);
        setCourse(i);
        setGrade(j);
        System.out.println("студент: " +name +", курс : " + course + ", оценка: " + grade);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.showInfo(new StringBuilder("Иван"), 2,12);

    }


}