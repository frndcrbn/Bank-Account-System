package bankaccountsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        try{
            while (true){
                System.out.println("Bank Account System");
                System.out.println("[1] Add Customer");
                System.out.println("[2] Remove Customer");
                System.out.println("[3] List Customers");
                System.out.println("[4] Add Account");
                System.out.println("[5] Remove Account");
                System.out.println("[6] Display Account for Customer");
                System.out.println("[7] Deposit money into an Account");
                System.out.println("[8] Withdraw money into an Account");
                System.out.println("[0] Exit.");
                System.out.print("Enter here: ");
                int choice = scanner.nextInt();
                switch (choice){
                    // Add Customer
                    case 1 :
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter address: ");
                        String address = scanner.next();
                        bank.addCustomer(new Customer(name, address));
                        System.out.println("Customer Added.");
                        break;
                    // Removed Customer
                    case 2:
                        System.out.print("Enter name: ");
                        name = scanner.next();
                        Customer customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            bank.removeCustomer(customer);
                            System.out.println("Customer has been removed.");
                        }else {
                            System.out.println("Customer not found.");
                        }
                        break;
                    // List Customer
                    case 3:
                        if(bank.getCustomers().isEmpty()){
                            System.out.println("There are no customer in the bank.");
                        }else {
                            System.out.println("List of Customer(s):");
                            for (Customer c : bank.getCustomers()) {
                                System.out.println("    Name    : " + c.getName());
                                System.out.println("    Address : " + c.getAddress());
                            }
                        }
                        break;
                    // Add Account
                    case 4:
                        System.out.print("Enter Customer name: ");
                        name = scanner.next();
                        customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            System.out.print("Enter initial balance: ");
                            float balance = scanner.nextFloat();
                            customer.addAccount(new Account(balance));
                            System.out.println("Account Added.");
                        }else {
                            System.out.println("Customer not found.");
                        }
                        break;
                    // Remove Account
                    case 5:
                        System.out.print("Enter Customer name: ");
                        name = scanner.next();
                        customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            System.out.print("Enter Account balance: ");
                            float balance = scanner.nextFloat();
                            Account account = customer.getAccounts().stream().filter(a -> a.checkBalance() == balance).findFirst().orElse(null);
                            if(account != null){
                                customer.getAccounts().remove(account);
                                System.out.println("Account removed.");
                            }else {
                                System.out.println("Account not found.");
                            }
                        }else {
                            System.out.println("Customer not found.");
                        }
                        break;
                    // List All Accounts
                    case 6:
                        System.out.print("Enter Customer name: ");
                        name = scanner.next();
                        customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            customer.getAccounts().forEach(a -> System.out.println("Balance: " + a.checkBalance()));
                        }else {
                            System.out.println("Customer not found.");
                        }
                        break;
                    // Deposit Account
                    case 7:
                        System.out.print("Enter Customer name: ");
                        name = scanner.next();
                        customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            System.out.print("Enter balance: ");
                            float balance = scanner.nextFloat();
                            Account account = customer.getAccounts().stream().filter(a -> a.checkBalance() == balance).findFirst().orElse(null);
                            if (account != null){
                                System.out.print("Enter amount: ");
                                float amount = scanner.nextFloat();
                                account.deposit(amount);
                                System.out.println("Account Successfully Deposit.");
                                System.out.println("Current Balance: " + account.checkBalance());
                            }else{
                                System.out.println("Account not found.");
                            }
                        }else{
                            System.out.println("Customer not found.");
                        }
                        break;
                    // Withdraw Account
                    case 8 :
                        System.out.print("Enter Customer name: ");
                        name = scanner.next();
                        customer = bank.getCustomers().stream().filter(c -> c.getName().equals(name)).findFirst().orElse(null);
                        if(customer != null){
                            System.out.print("Enter balance: ");
                            float balance = scanner.nextFloat();
                            Account account = customer.getAccounts().stream().filter(a -> a.checkBalance() == balance).findFirst().orElse(null);
                            if (account != null){
                                System.out.print("Enter amount: ");
                                float amount = scanner.nextFloat();
                                account.withdrawal(amount);
                                System.out.println("Account Successfully Withdrawn.");
                                System.out.println("Current Balance: " + account.checkBalance());
                            }else{
                                System.out.println("Account not found.");
                            }
                        }else{
                            System.out.println("Customer not found.");
                        }
                        break;
                    case 0:
                        System.out.println("Thank you for using us.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid input.");
                        break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Invalid Input");
        }

    }

}
