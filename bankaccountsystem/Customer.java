package bankaccountsystem;

public class Customer implements CustomerAbstract{

    private String firstName, lastName;
    private int age;

    Customer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void customerInfo(){
        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Age  : " + age);
    }

    public void accountInfo(){
        System.out.println("Account Name : ");
    }
}
