package com.kh.oop.methodex;

public class Return메서드Run {
    public static void main(String[] args) {
        Return메서드 rm = new Return메서드();

        // 1. 값을 가지고 있는 기능이지 출력 기능이 아님!
        // return에서 값을 전달하는 메서드로
        // 출력해서 보여주지 않음.
        //값을 보려면
        //System.out.println( rm.method1()); 로 볼수있다


        rm.method1();
        //2. print출력문 안에 기능을 작성해주었기 때문에,
        //해당 기능이 가지고 있는 값을 확인할 수 있음.
        System.out.println( rm.method1());

        //3. 변수명에 기능을 담아두고 이름으로 전달하시
        String 메서드1 = rm.method1();
        System.out.println(메서드1);

        /***** 매개변수가 있는 return 매서드 *****/
        rm.method2(5); //5라는 값을 가지고 있는 상태
        //출력해달라는 요청이 없기 때문에 눈에 보이지는 않음.
        System.out.println( rm.method2(5));
        //3-1 아이디 찾기
        System.out.println("이름이 박동식이고, 번호뒤 네자리가 8857 인 사람의 아이디 찾기");
        String b = rm.findId("박동식",8857);
        System.out.println("박동식의 숫자 아이디 : " + b);

        //
        int result1 = rm.더하기(2,1);
        System.out.println(result1);

        int result2 = rm.빼기(3,1);
        System.out.println(result2);
    }
}
