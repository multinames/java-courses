/**
 Êëàññ ðåàëèçóåò êàëüêóëÿòîð
 */
public class Calculator {

    /** Ðåçóëüòàò âû÷èñëåíèé */
    private int result;

    /** Ñóììèðóåì àðãóìåíòû. @param params Àðãóìåíòû ñóììèðîâàíèÿ */
    public void add(int ... params){
        for (Integer param : params) {
            this.result += param;
            }
    }
    /** Ïîëó÷èòü ðåçóëüòàò.*/
    public int getResult() {
        return this.result;
    }
    
    /**Î÷èñòèü ðåçóëüòàòû âû÷èñëåíèé*/
    public void cleanResult() {
        this.result = 0;
    }
}
