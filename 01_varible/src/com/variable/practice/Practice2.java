package com.variable.practice;

import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력해 주세요 : ");
        int korean = sc.nextInt();
        System.out.print("영어 점수를 입력해 주세요 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력해 주세요 : ");
        int math = sc.nextInt();

        int total = korean + english + math;
        int evg = (korean + english + math)/3;

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + evg);
    }
}
