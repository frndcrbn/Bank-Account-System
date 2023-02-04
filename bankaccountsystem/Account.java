package bankaccountsystem;

public class Account implements AccountAbstract {

    private float credits = 10000;
    private float balance = 0;
    private float amount = 0;

    public float deposit(float amount) {
        credits += amount;
        balance = credits;
        return balance;
    }

    public float withdrawal(float amount) {
        credits -= amount;
        balance = credits;
        return balance;
    }

    public void checkBalance() {
        System.out.println("Your balance is " + balance);
    }

}
