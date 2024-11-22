package com.kh.oop.basic;

public class 리턴 {
    /*
    * return 은 메서드에서 값을 반환하거나 메서드를 종료하는데 사용되는 키워드
    *
    * 1. 메서드(특정기능) 에서 값을 반환
    *   메서드가 실행을 마치고 호출한 곳으로 값을 반환할 때 사용
    *   반환하는 값의 타입은 메서드 명칭 작성하기 전에 지정한 자료형 타입과 일치
    *   public int  메서드명칭(){
    *         return 1;
    * }
    * 메서드명칭() 이라는 기능을 호출한 곳으로 1이하는 숫자값을 전달
    *
    * 2. 메서드종료
    *   메서드 내에서 return 을 사용하면 그 지점에서 메서드가 즉시 종료됨.
    *   반환값이 없는 메서드에서는 return;을 사용해서 메서드를 종료할 수 있음
    *
    *   public void 메서드명칭(){
    *           System.out.println("기능설정");
    *           return; //기능설정 출력하고 메서드명칭() 기능 종료하기
    *
    *   }
    *
    *   return으로 전달할 값이 존재한다면 메서드기능명을 작성하기전에 전달하고자 하는 값의
    *   자료형을 작성해준다.
    *
    *
    *
    *
    * */

    public void checkAge(int age){
        if(age < 18){
            System.out.println("미성년자 입니다.");
            return;

        }
        System.out.println("맥주 주문하시겠어요?");



















    }
}
