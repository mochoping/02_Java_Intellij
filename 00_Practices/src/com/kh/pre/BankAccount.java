package com.kh.pre;

public class BankAccount {
    //계좌번호
    //비밀번호
    //필드 = 속성= 전역변수 = 멤버변수 = 인스턴트변수
    private int accountNo;
    private double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount() {
    }

    /**
     * 입금 기능
     * @param amount 입금할 금액
     */
    public void deposit(double amount) {
        if (amount > 0) { // 금액이 0보다 클 경우에만 입금 가능
            balance += amount;
            System.out.println("Deposit successful" + balance+ " 원");
        } else {
            System.out.println("Deposit failed");
        }
    }


    /**
     * 출금 기능
     * @param amount 출금할 금액
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdraw failed. insufficient balance");

        }else {
            balance -= amount;
            System.out.println("Withdraw successful" + amount +" 원이 출금되었습니다. \n남은잔액: "+ balance+ " 원");
        }


    }


}
