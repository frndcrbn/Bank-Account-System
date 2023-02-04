package bankaccountsystem;

public interface AccountAbstract {

    float deposit(float amount);

    float withdrawal(float amount);

    void checkBalance();
}
