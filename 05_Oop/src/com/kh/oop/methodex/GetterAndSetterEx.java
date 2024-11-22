package com.kh.oop.methodex;

public class GetterAndSetterEx {

    private int age;

    //게터 세터 단추기 alt + insert

    public void setAge(int age) {
        //간단하게 유효성 검사 - setter에다가 값을 저장할 때 유효성 검사와 같은 if문 넣지 않음
        /*
        if (age <=0) {
        System.out.println("나이는 음수가 들어갈 수 없습니다.");
        }
         */
        this.age = age;
    }
        //게터 cngn @Getter 라는 이름으로 요약해서 사용.
    public int getAge() {
        return age;
    }
}
