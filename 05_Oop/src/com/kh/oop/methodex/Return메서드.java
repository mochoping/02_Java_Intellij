package com.kh.oop.methodex;

public class Return메서드 {
    /*
    데이터 베이스에 저장되어있는 값을 프론트 엔드에 전달할때 주로 사용
    public 자료형 메서드명(매게변수이름자리){
    // 기능 작성
    매서드가 특정 작업을 수행한 후 결과를 호출자에게 전달하려면 return을 사용해야함
    return (생략가능한 변수명 자리);
     */
    //1. 매개변수가 없는 return 메서드
    public   String      method1(){
        return "안녕하세요!";
    }

    //2. 매개변수가 있는 return 메서드
    public int method2(int abc){
        return abc;
    }
    //3. 매개변수에 있는 자료형과 return자료형이 다른 메서드
    public static String method3(int xyz){
            //static은 생략 가능. String은 출력 요건과 동일해야함.
        return "숫자가 들어왔습니다."; // String
    }
    //3-1 아이디 찾기
    public String findId(String name, int phone){
        return "DB에 저장된 ID 값 ";

    }
    //4. 매개변수를 활용해서 return 값 가져오기
    public int 더하기(int a, int b){
        return a + b;
    }
    public int 빼기(int c,int d){
        int 결과값 = c-d;
        return 결과값;
    }
}
