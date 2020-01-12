package Lesson22;

// Инкапсуляция

public class Human {
    final String pol;

    public Human(String pol) {
        this.pol =pol;
    }

    private boolean clever;

    public boolean isClever(boolean clever) {
        return  clever;
    }

    private StringBuilder name;

    public StringBuilder getName(){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName(StringBuilder s) {
        name =s;

    }

    private int age;

    public int gtAge(){
        return age;
    }
    public void setAge (int i){
        if (i > 0) {
            age =i;
        }
    }
    private int wt;

    public int getWt(){
        return wt;
    }
    public void setWt(int i){
        if (i > 0) {
            wt = i;
        }
    }
}

class TestHuman{
    public static void main(String[] args) {
        Human chel = new Human("male");
        chel.setName(new StringBuilder("Колян"));
        chel.getName().append("!!!");
        chel.setAge(50);
        chel.setWt(60);

        System.out.println("Имя: "+chel.getName() + ", возраст: " + chel.gtAge()+", вес: " + chel.getWt());
    }


}
