package bankaccountsystem;

import java.util.Scanner;

public class Program {

    public static int userPin = 811618;

    public static int adminPin = 000000;

    public static int tries = 3;

    void welcomeUser(){
        Account acc = new Account();
        System.out.println("Select a transaction: ");
        System.out.println("[1] Deposit.");
        System.out.println("[2] Withdraw.");
        System.out.println("[3] Check Balance.");
        System.out.print("Enter here: ");
        Scanner t = new Scanner(System.in);
        int trnsc = t.nextInt();
        switch (trnsc){
            case 1 :
                System.out.print("Enter amount: ");
                Scanner d = new Scanner(System.in);
                float dpst = d.nextFloat();
                acc.deposit(dpst);
                acc.checkBalance();
                tryTransaction();
            case 2:
                System.out.print("Enter amount: ");
                Scanner w = new Scanner(System.in);
                float wdt = w.nextFloat();
                acc.withdrawal(wdt);
                acc.checkBalance();
                tryTransaction();
            case 3:
                acc.checkBalance();
                tryTransaction();
            default:
                System.out.println("Please select of the choices.");

        }
    }

    void closing(){
        System.out.println("Thank you for using us.");
        System.exit(0);
    }

    void tryTransaction(){
        Scanner yn = new Scanner(System.in);
        System.out.print("Do you want to try another transaction(Y/N)? : ");
        char yes = yn.next().charAt(0);
        if(yes == 'Y' || yes == 'y'){
            welcomeUser();
        }else if(yes == 'N' || yes == 'n'){
            closing();
        }else{
            System.out.println("Invalid input.");
            tryTransaction();
        }
    }

    public static void main(String[] args) {
        Program p = new Program();
        do{
            System.out.println("BANK ACCOUNT SYSTEM");
            System.out.print("ENTER PIN: ");
            Scanner in = new Scanner(System.in);
            int pin = in.nextInt();
            if(pin == userPin){
                System.out.println("Welcome User!");
                p.welcomeUser();
                break;
            }else if(pin == adminPin){
                System.out.println("Welcome Admin!");
                break;
            }else{
                System.out.println("PIN is incorrect!");
                tries--;
                if(tries == 0){
                    System.out.println("Please comeback after a few minutes.");
                }
            }
        }while(tries != 0);

    }

}
