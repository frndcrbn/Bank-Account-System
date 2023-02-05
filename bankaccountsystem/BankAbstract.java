package bankaccountsystem;

import java.util.List;

public interface BankAbstract {

    void addCustomer(Customer customer);
    void removeCustomer(Customer customer);
    List<Customer> getCustomer();
}
