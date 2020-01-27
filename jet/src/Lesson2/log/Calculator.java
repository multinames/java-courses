package Lesson2.log;

import java.net.CacheRequest;

public class Calculator {

    private Logger logger;

    public Calculator(Logger logger){
        this.logger=logger;
    }


    public int sum(){
        logger.log("sum");
        return 1;
    }

    public int mult (){
        logger.log("mult");
        return 2;
    }

    public int dif(){
        logger.log("dif");
        return 3;
    }

    public int div(){
        logger.log("div");
        return 4;
    }
}
