package com.company.Flowers;

public class Flower {
    private String name;
    private double price;
    private String label;

    public double getPrice() {
        return price;
    }

    public String getLabel() {
        return label;
    }

    // Конструктор цветов
    public Flower (String name, double price, String label){
        this.name = name;
        this.price = price;
        this.label = label;

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

    public Rose(String name, double price, String label) {
        super(name, price, label);
    }
}

class Tulip extends Flower {

    public Tulip(String name, double price, String label) {
        super(name, price, label);
    }
}

class Carnation extends Flower {

    public Carnation(String name, double price, String label) {
        super(name, price, label);
    }
}

class Lily extends Flower {

    public Lily(String name, double price, String label) {
        super(name, price, label);
    }
}
