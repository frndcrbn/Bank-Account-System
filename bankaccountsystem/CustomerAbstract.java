package bankaccountsystem;

import java.util.List;

public interface CustomerAbstract {

    void addAccount(Account account);
    String getName();
    String getAddress();
    List<Account> getAccounts();
}
