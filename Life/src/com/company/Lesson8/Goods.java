package com.company.Lesson8;
/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User. (Интернет магазин)
*/


import java.util.Arrays;

public class Goods {
    String name;
    double price;
    int rating;

    public Goods(String name, double price, int rating){
        this.name = name;
        this.price= price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}

class Category {
    String name;
    Goods[] goods;

    // Конструктор Категорий
    public Category(String name, Goods...goods) {
        this.name = name;
        this.goods = goods;
    }
}

class Basket {
    Goods[] goods;
    public Basket(Goods...goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goods=" + Arrays.toString(goods) +
                '}';
    }
}

class User {
    String login;
    String password;
    Basket basket;

    // Конструктор
    public User (String login, String password, Basket basket){
        this.login = login;
        this.password = password;
        this.basket=basket;

    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}

class TestGoods{
    public static void main(String[] args) {


        // создание товаров (странно - почему в задани нет привязки к категории???
        Goods product1 = new Goods("Кефир",44.0,5);
        Goods product2 = new Goods("Молоко",49.0,4);

        Goods product3 = new Goods("Батон",33.0,3);
        Goods product4 = new Goods("Хлеб",41.0,4);

        Goods product5 = new Goods("Фарш говяжий",119.0,3);
        Goods product6 = new Goods("Печнь цеплят",99.0,4);

        product6.

        // Создать несколько объектов класса Категория
        Category cat1 = new Category("Молочная продукция",product1, product2);
        Category cat2 = new Category("Хлебо-булочные изделия",product1, product2);
        Category cat3 = new Category("Мясная продукция",product1, product2);



        // создание корзины
        Basket basket1 = new Basket(product1, product5);


        // Создать объект класса User
        User user1 = new User("login123", "password123", basket1);
        System.out.println(user1);




    }


}

