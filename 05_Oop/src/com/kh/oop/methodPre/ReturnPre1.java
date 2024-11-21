package com.kh.oop.methodPre;

public class ReturnPre1 {

    public String name = "홍길동";
    public int phone = 1234;
    public String id = "dongdong1004";


    // 이름과 핸드폰 번호가 일치할 때 일치하는 아이디를 전달하기
    public String findID(String a, int b) {
        //return "dongdong1004";

        // 두 입력정보가 일치한 고객이라면 아이디를전달.
        if (name.equals(a) && phone == b) {
            return id;
        }
        /*if(phone==b) {
            return id;
        }*/
        return "조회된 정보가 없습니다.";
        // 일치하지 않은 고객이라면 조회된 정보가 없습니다. 전달


    }

    //계산기
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
