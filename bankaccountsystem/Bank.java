package bankaccountsystem;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankAbstract{

    private List<Customer> customers;

    public Bank(){
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public List<Customer> getCustomers(){
        return customers;
    }

}
