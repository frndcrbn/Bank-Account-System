package bankaccountsystem;

public interface AccountAbstract {

    void deposit(float amount);

    void withdrawal(float amount);

    float checkBalance();
}
