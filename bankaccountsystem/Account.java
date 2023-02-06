package bankaccountsystem;

public class Account implements AccountAbstract {

    private float balance;

    public Account(float balance){
        this.balance = balance;
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdrawal(float amount) {
        if(balance - amount >= 0 ){
            balance -= amount;
        }
    }

    public float checkBalance() {
        return this.balance;
    }

}
