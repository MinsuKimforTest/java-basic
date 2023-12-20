package oop1.ex;

public class Account {
    int balance;

    void deposit(int balance) {
        this.balance += balance;
    }

    void withdraw(int balance) {
        if(this.balance >= balance){
            this.balance -= balance;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
