package com.kh.oop.constructor;

public class Member {
    //필드
    private String name;
    private int age;
    private String gender;

    //기본생성자 필수생성자
    public Member() {
    }

    public Member(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //메서드
    // 세터 게터
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    // 기본생성자 필수생성자 세터 게터 이외의 기능을 추가하고 싶다면 기능 추가
    // 작성된 정보 불러오기 기능
    //toString 메서드 : 객체 변수명에 저장된 정보를 문자열로 전달해서 보여줌
    //toString 어떤 개발자가 다른개발하는 사람들이 편안하게 쓸 수 있도록 자바자체에 만들어 놓은 기능
    @Override //누군가 만들어 놓은 기능을 재사용 한다라고 표기해놓은것 일종의 관례
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
}
