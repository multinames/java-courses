/**
 Класс реализует калькулятор
 */
public class Calculator {

    /** Результат вычислений */
    private int summResult;
    private int multResult;
    private int subResult;
    private float divResult;

    /** Суммируем аргументы. @param params Аргументы суммирования */
    public void add(int ... params){
        for (Integer param : params) {
            this.summResult += param;
            this.multResult = param * param;
            this.subResult = param - param;
            this.divResult = param / param;
        }
    }
    /** Получить результат. @summResult - результат сложения. @multResult - результат умножения,
     @subResult - результат вычитания, @divResult - результат деления*/
    public int getSummResult() {
        return this.summResult;
    }
    public int getMultResult() {
        return this.multResult;
    }
    public int getSubResult() {
        return this.subResult;
    }
    public float getDivResult() {
        return this.divResult;
    }
    /**Очистиь результаты вычислений*/
    public void cleanResult() {
        this.summResult = 0;
        this.multResult = 0;
        this.summResult = 0;
        this.divResult = 0;
    }
}
