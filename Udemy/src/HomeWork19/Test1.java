package HomeWork19;// package HomeWork19;

public class Test1 {

    public static void abc(String[] s, String ...n) {
        //String[] s1 = new String[]{"qwe", "iop","zxc","werty","asdf"};
        // String[] ar2 = new String[]{"qwe", "zxc","hjk","vght","asdf"};
        for (int i=0; i< s.length; i++) {
            for (int j=0; j< n.length; j++) {
            if (s[i] == n[j]) {
                System.out.println(s[i] + " " + n[j]);
            }
            }
        }
    }
    public static void main(String[] args) {
        abc(args, new String[]{"qwe", "asd"});
    }
}
