package ru.goboss.spring;

public class Seller {

    private Shop shop;

    public Seller(Shop shop) {
        this.shop = shop;
    }

    public String infoSeller(){
        return shop.name+ ", "+shop.address;
    }

}

class TestSeller{
    public static void main(String[] args) {

        Shop shop1 = new Shop();
        shop1.setName("Пятерка");
        shop1.setAddress("г.Лобня, ул. Ленина, 5");
        Seller seller1 = new Seller(shop1);


        System.out.println(seller1.infoSeller());

    }
}