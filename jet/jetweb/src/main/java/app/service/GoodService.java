package app.service;

import app.entity.Good;

import java.util.List;

public interface GoodService {
    Good get(int id);
    List<Good> get();
    void update (Good good);
    void  delete (int id);
    void insert (Good good);
}
