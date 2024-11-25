package com.kh.oop.constructor;

public class People {
    //필드
    private String name;
    private int age;

    //메서드
        //1. 기본생성자
        // 매개변수를 하나도 받지 않는 생성자
    public People(){
    }
        //2. 파라미터 생성자
        // 파라미터 생성자 (part, All)
        //2-1. 모든 필드에 값을 넣는 생성자
    public People(String name, int age){
        this.name = name;
        this.age = age;
    }
        //2-2. 부분적으로 값이 필수로 들어가야하는 필드만 선택하는 생성자
        // (이름만 전달받기 원한다면 해당 변수만 넣어서 작성)
    public People(String name){
        this.name = name;
    }
        // (나이만 필수로 전달 받길 원하면)
    public People(int age){
        this.age = age;
    }

        //3. 개발자가 넣은 값을 무사히 잘 넣었는지 확인하는 toString
        //@Override 사용시 관례상 붙어서 작성.
    @Override
    public String toString(){
        return "People{" + "name=" + name + ", age=" + age + '}';
    }

}
