package com.kh.practice7.model.vo;

import java.util.Scanner;

public class StudentRun {

    //이름 과목 점수

    // inform -> toString 이용해서 사용대체
    // run 학생데이터 5개 만들고 결과 확인
    public static void main(String[] args) {
        StudentController sc = new StudentController();

        System.out.println("=== 학생 정보 출력 ===");
        for(Student s : sc.printStudent()){
            System.out.println(s);
        }

        System.out.println("=== 학생 성적 출력 ===");
        double[] points = sc.avgScore();
        System.out.println("학생 점수 합계 : " +(int)points[0]);
        System.out.println("학생 점수 평균 : " +(int)points[1]);

        System.out.println("=== 성적 결과 출력 ===");
        for(Student s : sc.printStudent()){
            boolean result = s.getPoints() >= StudentController.CUT_LINE;
            System.out.println(s.getName() + "학생은" + result + "입니다.");
        }













        /*while(true) {
        Scanner scn = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = scn.nextLine();
        System.out.print("과목 : ");
        String subject = scn.nextLine();
        System.out.print("점수 : ");
        int point = scn.nextInt();
        sc.addInfo(name,subject,point);
        }*/
    }
}
