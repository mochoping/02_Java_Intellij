package com.kh.poly.pack3.interfaceEx;
//Animal 을 상속받는 뱀은 무조건 eat 과 sleep 의 기능을 구현해야함.
public class Snake extends Animal {
    private int poison;

    public int getPoison() {
        return poison;
    }

    public void setPoison(int poison) {
        this.poison = poison;
    }
    @Override
    public String toString() {
        return "snake{" + "poison=" + poison + '}';
    }

    @Override
    public void eat() {
        System.out.println("snake ,eat");
    }

    @Override
    public void sleep() {
        System.out.println("snake ,sleep zzz");
    }
}
