package Lesson2.log;

public class LoggerFactory {
    public static Logger getLogger (){
        return new DBLogger();
    }
}
