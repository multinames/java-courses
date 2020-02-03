package com.company.Lesson8;

public class Goods {
    String name;
    double price;
    int rating;

    public Goods(String name, double price, int rating){
        this.name = name;
        this.price= price;
        this.rating = rating;
    }
}

class Category {
    String name;
    Goods [] goods;
   // public Category(String name, String[]...Goods){

   // }
}

class Basket {
    public void addToBasket(Goods good){

    }
}
class TestGoods{
    public static void main(String[] args) {
        Category ct1 = new Category();
        Category ct2 = new Category();
        Category ct3 = new Category();

        Goods goods1 = new Goods("Сумка",20.0,5);
        Goods goods2 = new Goods("Туфли",210.0,4);
    }


}

