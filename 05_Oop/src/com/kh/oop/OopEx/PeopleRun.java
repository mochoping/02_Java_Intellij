package com.kh.oop.OopEx;

public class PeopleRun {
    public static void main(String[] args) {
        People p = new People("홍길동",800101,23467890);
        System.out.println(p.toString());
        People p2 = new People("김개붕",831210,12345678); //취미 특기까지 모두작성
        p2.setHobby("음악듣기");
        p2.setSpecialty("코딩");
        System.out.println(p2.toString());


    }
}
