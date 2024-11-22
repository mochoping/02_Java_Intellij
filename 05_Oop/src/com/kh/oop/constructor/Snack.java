package com.kh.oop.constructor;

public class Snack {

    /*
    SnackRun에
    1.기본생성자
    초코칩쿠키 1500 달콤한 초코맛
    허니버터침 2000 달콤한 버터맛

    2. 매개변수 all생서자
    새우깡 1200 짭짤한 새우맛

    과자정보 toString 출력
     */
    public Snack(){}
    private String name;
    private int cost;
    private String flavor1;
    private String flavor2;
    public Snack(String name, int cost, String flavor1, String flavor2) {
        this.name = name;
        this.cost = cost;
        this.flavor1 = flavor1;
        this.flavor2 = flavor2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setFlavor1(String flavor1) {
        this.flavor1 = flavor1;
    }

    public void setFlavor2(String flavor2) {
        this.flavor2 = flavor2;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getFlavor1() {
        return flavor1;
    }

    public String getFlavor2() {
        return flavor2;
    }

    @Override
    public String toString() {
        return "Snack [name=" + name + ", cost=" + cost + ", flavor1=" + flavor1 + ", flavor2=" + flavor2 + "]";
    }
}
