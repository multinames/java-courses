package app;

import app.dao.GoodRepository.GoodRepository;
import app.dao.PreparedDB;
import app.entity.Good;
import app.exeptions.PreparedException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

// Connection - для подлкючения к DB
// Statement -  для выполенения запросов
// PrepareStatement - для выполенения подготовленных запросов
// ResultSet - для хранения результатов запрсов SELECT

@SpringBootApplication
public class App {
    public static void main(String[] args)  {
        SpringApplication.run(App.class, args);



      //GoodRepository.update(new Good("MyName",11,2,5));



        /// GoodRepository.delete(4);
        // PreparedDB.prepare();
        // add new goods

        /*    Good good = new Good("Steak",1500,10);
            GoodRepository.insert(good);*/
        /*try {
            List<Good> goods = GoodRepository.get();

            for(Good g: goods){
                System.out.println(g);
            }
        } catch (PreparedException e) {
            System.out.println(e.getMessage());;
        }
*/
       /*Good good = GoodRepository.get(1);
        System.out.println(good);
*/
       // GoodRepository.delete(3);
    }
}
