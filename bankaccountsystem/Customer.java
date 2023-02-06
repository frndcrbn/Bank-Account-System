package bankaccountsystem;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerAbstract{

    private String name;
    private String address;
    private List<Account> accounts;

    public Customer(String name, String address){
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public List<Account> getAccounts(){
        return accounts;
    }

}
