package com.kh.oop.constructor;

import com.kh.oop.constructor.Student;

public class StudentRun {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("홍길동");
        s1.setAge(21);
        s1.setGender("남성");
        s1.setMajor("컴퓨터공학");
        s1.setGpa(3.8);
        s1.setPhoneNumber("010-2345-6789");
        s1.setEmail("hong123@gmail.com");
        s1.setAddress("서울");
        System.out.println(s1.toString());

        Student s2=new Student("김개붕", 36,"남성","물리학",3.8,"010-1234-5678","www@wwww.wwww","석촌동");
        System.out.println(s2.toString());



    }




}