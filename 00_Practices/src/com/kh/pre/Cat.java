package com.kh.pre;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("meaw");
    }
}
