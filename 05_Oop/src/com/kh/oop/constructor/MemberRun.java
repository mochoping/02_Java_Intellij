package com.kh.oop.constructor;

public class MemberRun {
    public static void main(String[] args) {
        //맴버 1은 하나씩 하나씩 이름 나이 성별을 넣어줄 것
        //암호화 설정같은 특수기능을 하나씩 작성후 넣어줄때 사용
        Member m1 = new Member();
        m1.setName("홍길동");
        m1.setAge(40);
        m1.setGender("남");
        //맴버 2는 한번에 이름 나이 성별 넣어줄 것

        Member m2 = new Member("감길자", 50 ,"남성");
        //조회할때 많이 사용. 한번에 값을 저장할때.

        //m1과 m2 에 각각 작성한 값들이 저장되어 있는지 확인

        //Getter 로 값을 가져오기
        System.out.println("***** m1 의 정보 *****");
        System.out.println(m1.getName());
        System.out.println(m1.getAge());
        System.out.println(m1.getGender());

        System.out.println("***** m2 의 정보 *****");
        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getGender());

        // toString 이용해서 한번에 모든 값 출력하기
        System.out.println("toString() 메서드 기능 재사용 결과");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        // toString 도 값을 가지고만 있고, 출력기능이 따로 없음.



    }
}
