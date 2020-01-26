package HomeWork1;
// Циклы
public class Home4 {
    public static void main(String[] args) {
        HomeWork4 z1 = new HomeWork4();
        z1.forFive();
        System.out.println("");
        z1.forFiveMinus();
        System.out.println("");
        z1.tab3();
        System.out.println("");
        System.out.println("Сумма чисел от 1 до 10 = "+z1.summ());
        z1.summ98();
        System.out.println("");
        System.out.println("Сумма четных чисел от 1 до 100 = "+z1.summ100());
        System.out.print(" Сумма = " +z1.summ50());
        System.out.println("");
        z1.writeStar();
    }

}

class HomeWork4 {
// Необходимо вывести на экран числа от 1 до 5
    public void forFive(){
        for(int i=1;i<6;i++) {
            System.out.print(i+" ");
        }
    }
// Необходимо вывести на экран числа от 5 до 1.
    public void forFiveMinus(){
        for(int i=5;i>0;i--) {
            System.out.print(i+" ");
        }
    }
//Необходимо вывести на экран таблицу умножения на 3
    public void tab3(){
        for(int i=1;i<11;i++) {
            System.out.print((i*3)+" ");
        }
    }
    //Просуммировать все числа от 1 до 10
    public int summ(){
        int n=0;
        for (int i=1;i<11;i++) {
            n=n+i; }
        return n;
    }
    //последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98
    public void summ98(){
        int s=7;
        while (s <=98) {
            System.out.print(s+" ");
            s+=7;
        }
    }
    //Вывести сумму четных чисел последовательности от 1 до 100
    public int summ100 (){
        int s=0;
        for (int i=0;i <=100;i+=2) {
            s=s+i;
            //System.out.print(i+ " ");
        }
        return s;
    }
    //Вывести сумму и количество нечетных числе от 1 до 50

    public int summ50(){
        int s=0,n=0;
        System.out.print("Количество нечетных чисел от 1 до 50 = ");
        for (int i=1;i <=50;i++) {
            s=s+i;
            if ((i%2)!=0) {
                n+=1;
            }
        }
            System.out.print(n);
        return s;
    }

    public void writeStar(){
        int j=0;
        while (j !=3){
            for (int i = 0; i <= 4; i++) {
                System.out.print("*");
            }
            System.out.println("");
            j++;
        }
    }

}