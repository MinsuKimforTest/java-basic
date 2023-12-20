package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account acount = new Account();

        acount.deposit(10000);
        System.out.println(acount.balance);
        acount.withdraw(9000);
        System.out.println(acount.balance);
        acount.withdraw(2000);
        System.out.println(acount.balance);

    }

}
