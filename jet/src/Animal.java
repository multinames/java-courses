public class Animal {
    private int age;
    private String name;
    private static int count;

    final static String LABEL = "ANIMAL";

    public int getAge(){
        return age;
    }

    public static int getCount (){
        return count;
    }

    public void setAge (int age) {
        this.age =age;
    }

    public String getName (){
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public Animal (){
        count++;
    }
    public Animal (String name, int age) {
        this.name =name;
        this.age = age;
        count++;
    }
}
