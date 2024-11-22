package com.kh.oop.methodPre;

import com.kh.oop.basic.Nation;

public class StudentRun {

    public static void main(String[] args) {
        // Student 객체 s 생성
        // 홍길동, 남성, 17, 컴퓨터공학

        //객체에 저장된 값을 출력

        Student s = new Student();
        s.setName("홍길동");
        s.setGender("남성");
        s.setAge(17);
        s.setMajor("컴퓨터공학");

        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getGender());
        System.out.println(s.getAge());
        System.out.println(s.getMajor());


    }
}
