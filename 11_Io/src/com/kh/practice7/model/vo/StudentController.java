package com.kh.practice7.model.vo;

import java.util.ArrayList;

public class StudentController {
    ArrayList<Student> infos = new ArrayList<>();

    public void addInfo(String name, String className, int point){
        Student s1=new Student(name,className,point);
        infos.add(s1);
        System.out.println("학생 정보 추가 완료.");
    }
}
