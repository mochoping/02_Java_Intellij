package com.kh.poly.pack2.animalPre;

public class Animal {
    private String name;
    private int age;

   /* class dog extends Animal {
        private String 품종;
        private int 산책횟수;
    }

    class cat extends Animal {
        private String 색상;
        private int 펀치횟수;
    }

    */

    public Animal() {
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
