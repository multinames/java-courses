package HomeWork2;

public class Phone {
    String number;
    String model;
    double weight;
// Конструкторы
    public Phone(){}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

// Методы

    public void receiveCall(String nameCalled){

        System.out.println("Звонит "+nameCalled);
    }

    public void receiveCall(String nameCalled, String number){

        System.out.println("Звонит "+nameCalled+ " "+number);
    }

    public String getNumber(String number){
        this.number =number;
        return number;
    }

    public void sendMessage(String...num){
        System.out.print("Номера звонящих: ");
        for (int i=0;i<num.length;i++) {
        System.out.print(num[i]+", "); }
    }
}

class PhoneTest {
    public static void main(String[] args) {
        Phone ph1 = new Phone("926-234-54-34","Nokia",500);
        Phone ph2 = new Phone();
        Phone ph3 = new Phone();
        System.out.println(ph1.number);

        ph1.receiveCall("Иван");
        System.out.println(ph1.getNumber("9262347634"));
        ph2.receiveCall("Петр","903-789-32-45");
        ph3.sendMessage("925-653-67-45","903-345-34-54");
    }
}