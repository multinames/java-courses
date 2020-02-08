package app.controller;

import app.entity.Good;
import app.service.GoodService;
import app.service.GoodServiceInMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodController {

    @Autowired
    @Qualifier("goodServiceInMemory")
    private GoodService service;

    @GetMapping("/get")
    public List<Good> getGoods(){

        return service.get();
    }

    @PostMapping("/add")
    public boolean add (@RequestBody Good good) {

        service.insert(good);
        return true;
    }

    @DeleteMapping("/del")
    public boolean delete(@RequestBody int id) {

        service.delete(id);
        return true;
    }

    @GetMapping("/get/{id}")
    public Good get(@PathVariable("id")int id) {

        return service.get(id);
    }
    @PostMapping("/update")
    public boolean update(@RequestBody Good good) {

        service.update(good);
        return true;
    }


    /*public String getGoods(){
        return "My Goods";
    }*/
}
