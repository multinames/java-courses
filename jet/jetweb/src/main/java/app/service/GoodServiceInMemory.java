package app.service;

import app.entity.Good;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("goodServiceInMemory")
public class GoodServiceInMemory implements GoodService {
    public static List<Good> list = new ArrayList<>();

    static {
        list.add(new Good(1, "Milk", 89.90, 50));
        list.add(new Good(2, "Bread", 49.90, 10));
        list.add(new Good(3, "Beef", 189.90, 20));
        list.add(new Good(4, "Orange", 99.90, 21));
    }

    public Good get(int id) {
        for (Good good : list) {
            if (good.getId() == id) {
                return good;
            }
        }
        throw new RuntimeException("Нет товаров");
    }

    public List<Good> get() {
        return list;
    }

    public void delete(int id) {
        for (Good good : list) {
            if (good.getId() == id) {
                list.remove(good);
                 return;
            }
        }
        throw new RuntimeException("Товар не найден");
    }

    public void update(Good good) {
        Good oldGood = this.get(good.getId());
        list.remove(oldGood);
        list.add(good);

    }

    public void insert (Good good) {
        list.add(good);
    }

}


