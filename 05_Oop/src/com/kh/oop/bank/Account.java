package com.kh.oop.bank;
/*계좌 클래스 */
public class Account {

    private String name;
    private String accountNumber;
    private double balance;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    //기능설정 = method 설정
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " 의 현재 잔액 : "+ balance);
    }
    // 출금 매서드 만들기
    // 계좌 잔액보다 금액이 부족하면 잘못된 출금 금액이거나 잔액이 부족합니다.
    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("잘못된 출금 금액이거나 잔액이 부족합니다.");
            System.out.println("현재 계좌 잔액 : " + balance + "원");
            return; // 출금 중지하고 기능 종료
        } else if (amount<=0) {
            System.out.println("잘못된 출금 금액입니다.");
            return;
        } else {
            balance -= amount;
        }
    }
}
