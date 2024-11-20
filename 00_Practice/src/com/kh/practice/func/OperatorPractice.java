package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
    Scanner sc = new Scanner(System.in);
    public void practice1() {
        System.out.println("정수를 입력하세요 : ");
        int a = sc.nextInt();
        String result = "음양수";
        if (a > 0){
            result = "다.";
        } else if (a == 0) {
            result =  "와 음수가 아니다.";
        } else {
            result = "가 아니다.";
        }
        System.out.println("양수"+result);


    }
    public void practice2() {
        System.out.println("숫자를 입력하세요 : ");
        int a = sc.nextInt();
        String result = "음양수";
        if (a > 0){
            result = "양수다.";
        } else if (a == 0) {
            result = "0이다.";
        } else {
            result = "음수다.";
        }
        System.out.println(result);
    }
    public void practice3() {


    }
}
