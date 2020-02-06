package app;

import app.dao.GoodRepository.GoodRepository;
import app.dao.PreparedDB;
import app.entity.Good;
import app.exeptions.PreparedException;

import java.util.List;

// Connection - для подлкючения к DB
// Statement -  для выполенения запросов
// PrepareStatement - для выполенения подготовленных запросов
// ResultSet - для хранения результатов запрсов SELECT

public class App {
    public static void main(String[] args) {

        try {
           // PreparedDB.prepare();
/*            Good good = new Good("Steak",1500,10);
            GoodRepository.insert(good);*/

              List<Good> goods = GoodRepository.get();

              for(Good g: goods){
                  System.out.println(g);
              }
        } catch (PreparedException e) {
            System.out.println(e.getMessage());;
        }


    }
}
