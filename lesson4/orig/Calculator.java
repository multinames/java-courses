/**
 ����� ��������� �����������
 */
public class Calculator {

    /** ��������� ���������� */
    private int summResult;
    private int multResult;
    private int subResult;
    private float divResult;

    /** ��������� ���������. @param params ��������� ������������ */
    public void add(int ... params){
        for (Integer param : params) {
            this.summResult += param;
            this.multResult = param * param;
            this.subResult = param - param;
            this.divResult = param / param;
        }
    }
    /** �������� ���������. @summResult - ��������� ��������. @multResult - ��������� ���������,
     @subResult - ��������� ���������, @divResult - ��������� �������*/
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
    /**������� ���������� ����������*/
    public void cleanResult() {
        this.summResult = 0;
        this.multResult = 0;
        this.summResult = 0;
        this.divResult = 0;
    }
}
