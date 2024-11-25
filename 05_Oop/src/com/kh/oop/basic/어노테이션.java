package com.kh.oop.basic;

public class 어노테이션 {
    /*
    @ (어노테이션, Annotation = 주석을 다는 행위, 설명 부가정보)

    Spring 주로 사용

    자주 사용되는 시본 어노테이션
    @Override
    오버라이딩
        처음에 메서드를 작성한 클래스에서 처음 만들어진 메서드를 두번째 이후 다른클래스가 자식 클래스에 맞게 다시 구현하는것

        부모클래스에서 메서드에 주과된 이름, 매개변수, 리턴타입은 그대로,
        하지만 메서드의 동작은 변경할 수 있음.

        예를 들어 toString 메서드가 대표적인 예
        최초로 _toString_이 만들어진 클래스.java
        toString() 메서드 기능을 만들 때
        return 값으로 String 으로 묶어서 필드값을 확인하게 만들자.


     */
    /*
    getter setter constructor toString 과 같이 자주사용하는 메서드는
    lombok 이라는 회사에서 만든 기능을 활용해서

    @Getter
        public String getName(){
            return name;
        }
    @Setter
        public String getName(){
            this.name = name;
        }

    constructor
    @NoArgsConstructor
        //Args = 매개변수에 들어갈 값
        // 매개변수 = 전달인자 값을 넣기위한 변수명
        // 기본생성자 표기
    @AllArgsConstructor
        //  모든 매개변수 값을 저장하는 필수 생성자

        //  public 클래스명(위에 작성한 모든 필드값의 매개변수명 생성){
            this.필드1 = 매개변수명1;


     */
}
