/**
 * Created by lenovo on 5/22/2018.
 */
public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(12345,400.0,"Ajinkya","abc@gmail.com","7845122356");

        bankAccount.withdraw(100.0);
        bankAccount.deposit(50.0);
        bankAccount.deposit(51.0);
        bankAccount.withdraw(100.0);
    }

}
