package app.controller;

import app.entity.Good;
import app.service.GoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodController {
    @GetMapping("/get")
    public List<Good> getGoods(){
        GoodService gs = new GoodService();
        return gs.get();
    }

    @PostMapping
    public boolean add (@RequestBody Good good) {
        GoodService gs = new GoodService();
        gs.insert(good);
        return true;
    }

    @GetMapping("/get/{id}")
    public Good get(@PathVariable("id")int id) {
        GoodService gs = new GoodService();
        return  gs.get(id);
    }


    /*public String getGoods(){
        return "My Goods";
    }*/
}
