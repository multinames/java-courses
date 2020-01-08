package HomeWork19;

public class HomeWork19 {
    static void abc(String[] s, String ...n){

        for (int i=0; i <s.length;i++) {
            for (int j = 0; j < n.length; j++)
                if (s[j].equals(n[i])) {
                    System.out.println("match: " + n[i]+" и " +s[j]);
                }
        }
    }
    public static void main(String[] args) {
        abc(new String[]{"qaz","qwe","asd","vbn"}, new String[]{"qwe","rty","asd","dcv"});
    }
}

