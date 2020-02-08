package app.service;

import app.entity.Good;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("goodServiceInJMS")
public class GoodServiceInJms implements GoodService{
    @Override
    public Good get(int id) {
        return null;
    }

    @Override
    public List<Good> get() {
        return null;
    }

    @Override
    public void update(Good good) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void insert(Good good) {

    }
}
