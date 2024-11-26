package com.kh.poly.pack3.interfaceEx;

public abstract class Animal {
    //동물들의 공통된 필드 / 메서드 작성
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }

    /*
        모든 동물들이 가지고 있는 기능
        모든 동물이 먹고, 자는 행위를 가지고 있음
        그방법들이 너무 다양해서 하나도 정의 내리기가 어려움

        Animal 클래스를 상속 받는 자식 클래스가
        각자에게 맞춰 재정의(Overriding) 하도록 강제화 시킴

         */
    public abstract void eat();
    public abstract void sleep();



}
