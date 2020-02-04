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
}

class Category {
    String name;
    Goods [] goods;

    // Конструктор Категорий
    public Category(String name, String[]...goods){

    }
}

class Basket {
   // String[] productInCart;

   //  public Basket( Goods productInCart){};

    public void shoppingCart(String[]...productInCart){
        System.out.println(Arrays.deepToString(productInCart));
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
}

class TestGoods{
    public static void main(String[] args) {

        // Создать несколько объектов класса Категория
        Category ct1 = new Category("Сумки", new String[] {"сумка красная", "сумка синяя", "сумка черная"});
        Category ct2 = new Category("Футболки", new String[] {"футболка мужская", "футболка женская", "футболка деская"});
        Category ct3 = new Category("Телефоны", new String[] {"смартфоны", "кнопчатые", "настольные"});

        // создание товаров (странно - почему в задани нет привязки к категории??? )
        Goods product1 = new Goods("Сумка",20.0,5);
        Goods product2 = new Goods("Туфли",210.0,4);

        // создание корзины
        Basket basket1 = new Basket();

        // Помещаем товары в корзину
        basket1.shoppingCart(new String[]{product1.name, product2.name});


        // Создать объект класса User

        User user1 = new User("login123", "password123", basket1 );
        System.out.println(user1.basket);


    }


}

