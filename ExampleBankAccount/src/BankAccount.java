/**
 * Created by lenovo on 5/22/2018.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

        System.out.println(" " + accountNumber + " " + balance + " "+ name + " " + email + " " + phoneNumber);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposite amount " + depositAmount + " made.New balnce is " + this.balance);
    }

    public void withdraw(double withDraw){
        if (this.balance - withDraw <=0 ){
            System.out.println("Only " + this.balance + " availble. Withdrawal not processed.");
        }else {
            this.balance -= withDraw;
            System.out.println("Withdrawal of " + withDraw + " processed. Remaining balance = " + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
