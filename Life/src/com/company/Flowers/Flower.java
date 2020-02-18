package com.company.Flowers;

public class Flower {
    private String name;
    private double price;

    /*public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }*/

    public Flower (double price, String name){
        this.price = price;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                 " name=" + name +
                '}';
    }
}

class Rose extends Flower {

    public Rose(double price, String name) {
        super(price,name);
    }
}

class Tulip extends Flower {

    public Tulip(double price,String name) {
        super(price,name);
    }
}

class Carnation extends Flower {

    public Carnation(double price,String name) {
        super(price,name);
    }
}

class Lily extends Flower {

    public Lily(double price, String name) {
        super(price, name);
    }
}
