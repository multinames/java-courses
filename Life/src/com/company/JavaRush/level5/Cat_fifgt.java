package com.company.JavaRush.level5;

public class Cat_fifgt {

        public int age;
        public int weight;
        public int strength;

        public Cat_fifgt() {
        }

        public boolean fight(Cat_fifgt anotherCat){
            boolean resut = false;
            int thCat=0, anCat=0;

            if (this.age > anotherCat.age)
                thCat++;
            else if (this.age == anotherCat.age) {
                thCat++;anCat++;}
            else anCat++;

            if (this.weight > anotherCat.weight)
                thCat++;
            else if (this.weight == anotherCat.weight) {
                thCat++;anCat++;}
            else anCat++;

            if (this.strength > anotherCat.strength)
                thCat++;
            else if (this.strength == anotherCat.strength) {
                thCat++;anCat++;}
            else anCat++;

//            System.out.println(thCat);
//            System.out.println(anCat);

            if (thCat==anCat) resut = false;
            else if (thCat > anCat) resut = true;
            else resut = false;

            System.out.println(resut);

            return resut;

        }

    public static void main(String[] args) {
        Cat_fifgt cat1 = new Cat_fifgt();
        cat1.age = 10;
        cat1.strength = 1;
        cat1.weight =1;

        Cat_fifgt cat2 = new Cat_fifgt();
        cat2.age = 1;
        cat2.weight = 10;
        cat2.strength = 1;

      cat2.fight(cat1);
      cat1.fight(cat2);
    }
}
