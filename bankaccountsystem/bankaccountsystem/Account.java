package bankaccountsystem;

public class Account implements AccountAbstract {

    private float balance;

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdrawal(float amount) {
        this.balance -= amount;
    }

    public float checkBalance() {
        System.out.println("Your balance is " + balance);
        return this.balance;
    }

}
