package com.kh.practice7.model.vo;

import java.util.ArrayList;

public class StudentController {
    private Student[] sArr = new Student[5];

    public static final int CUT_LINE = 60; // 기준점수는 상수로 변할일이 없음

    public StudentController() {
        sArr[0] = new Student("김길동","자바",100);
        sArr[1] = new Student("박길동","디비",50);
        sArr[2] = new Student("이길동","화면",85);
        sArr[3] = new Student("정길동","서버",60);
        sArr[4] = new Student("홍길동","자바",20);

    }
    // 학생 정보 출력

    public Student[] printStudent(){
        return sArr;
    }

    public int sumScore(){
        int sum = 0;
        for(Student student : sArr){
            sum += student.getPoints();
        }
        return sum;//int 형이기 때문에 종료가되면 결과 반환 필요
    }
    public double[] avgScore(){
        int sum = sumScore();
        double avg = (double)sum / (double)sArr.length;
        return new double[]{avg,sum};
    }




    /*ArrayList<Student> infos = new ArrayList<>();

    public void addInfo(String name, String subject, int point){
        Student s1=new Student(name,subject,point);
        infos.add(s1);
        System.out.println("학생 정보 추가 완료.");
    }*/
}
