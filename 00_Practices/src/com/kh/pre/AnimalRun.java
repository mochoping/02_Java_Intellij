package com.kh.pre;

public class AnimalRun {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        System.out.println("cat은 animal에 적혀있는 동물소리까지 출력하도록 기능작성.");
        System.out.println("기능을 작성했기 때문에 Animal 에 적혀있는 [MakeSound] 출력");
        System.out.println("super.makesound() 제거시 미출력.");
        Cat cat = new Cat();
        cat.makeSound();
    }
}
