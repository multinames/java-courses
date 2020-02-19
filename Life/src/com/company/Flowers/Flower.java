package com.company.Flowers;

public class Flower {
    private String name;
    private double price;
    private int id;

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Конструктор
    public Flower (String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;

    }


    @Override
    public String toString() {
        return "{" +
                "name=" + name +
                " price=" + price +
                 '}';
    }


}

class Rose extends Flower {

    public Rose(String name, double price, int id) {
        super(name, price, id);
    }
}

class Tulip extends Flower {

    public Tulip(String name, double price, int id) {
        super(name, price, id);
    }
}

class Carnation extends Flower {

    public Carnation(String name, double price, int id) {
        super(name, price, id);
    }
}

class Lily extends Flower {

    public Lily(String name, double price, int id) {
        super(name, price, id);
    }
}
