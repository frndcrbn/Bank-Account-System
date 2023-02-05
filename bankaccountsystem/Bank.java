package bankaccountsystem;

import java.util.ArrayList;
import java.util.List;

public class Bank implements BankAbstract{

    private String name;
    private List<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    public List<Customer> getCustomer(){
        return customers;
    }

}
