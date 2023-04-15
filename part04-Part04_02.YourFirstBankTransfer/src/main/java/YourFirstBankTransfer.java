
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account new1 = new  Account ("Matthews account", 1000.0);
        Account new2 = new Account("My account", 0);

        new1.withdrawal(100);
        new2.deposit(100);
        System.out.println(new1);
        System.out.println(new2);
    }
}
