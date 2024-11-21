package com.kh.oop.methodex;

public class Void메서드Run {
    public static void main(String[] args) {
        Void메서드 v1 = new Void메서드();
       // v1.method1();

        String userId = "홍길동";

        //v1.method2(userId);

        int age =40;
        //40이라는 나이를 age로 전달
        //v1.method3(age);

        //v1.method4("박철수",50);
        //String, int 순서대로 값을 넣어주겠다 표기를 해놓았기 때문에, 순서에 맞춰야한다.

        String id = "kht";
        String pw = "kht123!@";
        v1.login(pw,id);
    }


}
