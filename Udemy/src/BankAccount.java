public class BankAccount {
    // Переменный ибъекта instance
    int id =10;
    String name = "Pider";
    double balance = 100;
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Sergey";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        //YourAccount.name = "Mike";
        YourAccount.balance = 2.0;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 124.12;

        System.out.println(YourAccount.name);
    }
}