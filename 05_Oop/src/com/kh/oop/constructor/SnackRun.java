package com.kh.oop.constructor;

public class SnackRun {
    public static void main(String[] args) {
        Snack sr1 = new Snack();
        sr1.setName("초코칩");
        sr1.setCost(1500);
        sr1.setFlavor1("달콤한");
        sr1.setFlavor2("초코맛");
        System.out.println(sr1.toString());

        Snack sr2 = new Snack();
        sr2.setName("허니버터칩");
        sr2.setCost(2000);
        sr2.setFlavor1("달콤한");
        sr2.setFlavor2("버터맛");
        System.out.println(sr2.toString());

        Snack sr3 = new Snack("새우깡",1200,"짭짤한","새우맛");
        System.out.println(sr3.toString());







    }
}
