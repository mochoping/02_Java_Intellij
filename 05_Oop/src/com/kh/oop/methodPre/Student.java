package com.kh.oop.methodPre;

public class Student {
    //필드 = 속성 = 멤버변수 = 전역변수
    // 학생의 이름, 나이 학년 전공
    private String name;
    private int age;
    private String gender;
    private String major;

    //기본 생성자
    public Student() {}
    //생성자(모든 파라미터값을 필수오 가져와서 넣기 때문에 필수 생성자 allConstructor)
    public Student(String name, int age, String gender, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.major = major;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
