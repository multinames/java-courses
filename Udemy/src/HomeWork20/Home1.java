package HomeWork20;

import java.util.ArrayList;

public class Home1 {
    public ArrayList<String> abc (String ...n){
        ArrayList<String> list = new ArrayList();
        for (String array:n) {

            list.add(new String(array));
        }
        System.out.println(list);
        return list;

    }

    public static void main(String[] args) {
        Home1 hm1 = new Home1();
        hm1.abc("qwey","asdf", "zxcv","ok","vtf");
    }
}
