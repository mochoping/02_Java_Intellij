package com.kh.pre;

public class BankAccountRun {
    public static void main(String[] args) {
        //
        BankAccount b = new BankAccount(123-456,1000);
        b.deposit(5000);
        b.withdraw(5000);
        b.withdraw(500000);
    }
}
