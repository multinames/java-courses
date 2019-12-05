/**
 Класс реализует калькулятор
 */
public class Calculator {

    /** Результат вычислений */
    private int result;

    /** Суммируем аргументы. @param params Аргументы суммирования */
    public void add(int ... params){
        for (Integer param : params) {
            this.result += param;
            }
    }
    /** Получить результат.*/
    public int getResult() {
        return this.result;
    }
    
    /**Очистиь результаты вычислений*/
    public void cleanResult() {
        this.result = 0;
    }
}
