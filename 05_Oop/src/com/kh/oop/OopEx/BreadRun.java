package com.kh.oop.OopEx;

public class BreadRun {
    public static void main(String[] args) {
        Bread b1 = new Bread();
        b1.setBreadName("소금빵");
        Bread b2 = new Bread("초코소라빵",1500,2);

        System.out.println(b1.getBreadName());
        System.out.println("b2 와 b1 값이 어떻게 설정되어 있는지 확인하기");
        System.out.println(b2.toString());
        System.out.println(b1.toString());
        // int -> 값지정 안되어있을때 기본값 0
        //Stringn 문자열에 아무값도 없다면 null


    }
}
