package app.controller;

import app.entity.Good;
import app.service.GoodServiceInMemory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodController {
    @GetMapping("/get")
    public List<Good> getGoods(){
        GoodServiceInMemory gs = new GoodServiceInMemory();
        return gs.get();
    }

    @PostMapping("/add")
    public boolean add (@RequestBody Good good) {
        GoodServiceInMemory gs = new GoodServiceInMemory();
        gs.insert(good);
        return true;
    }

    @DeleteMapping("/del")
    public boolean delete(@RequestBody int id) {
        GoodServiceInMemory gs = new GoodServiceInMemory();
        gs.delete(id);
        return true;
    }

    @GetMapping("/get/{id}")
    public Good get(@PathVariable("id")int id) {
        GoodServiceInMemory gs = new GoodServiceInMemory();
        return gs.get(id);
    }
    @PostMapping("/update")
    public boolean update(@RequestBody Good good) {
        GoodServiceInMemory gs = new GoodServiceInMemory();
        gs.update(good);
        return true;
    }


    /*public String getGoods(){
        return "My Goods";
    }*/
}
