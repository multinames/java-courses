package HomeWork19;

public class HomeWork19 {
    static void abc(String[] ...n){

        String[] s = new String[]{"qwe","rty","asd","dcv"};

        for (int i=0; i <s.length;i++) {
            for (int j = 0; j < n.length; j++) {
                System.out.println("s[] "+s[i] + " n[]" + n);
                /*if (s[i].equals(n[j])) {
                    System.out.println("match: " + n[j] + " and " + s[i]);
                    n[i] = null;
                }*/
            }
        }

        /*for (int k=0; k <s.length; k++) {
            System.out.println(s[k]);
        }*/
    }
    public static void main(String[] args) {
        // abc(args);
        abc(new String[]{"dfg","fgh","asd","zxc"});
    }
}

