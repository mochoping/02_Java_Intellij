package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner1 {
    public static void main(String[] args) {

       try {
           Scanner sc = new Scanner(System.in);
           // 숫자 입력받오 나누기에대한 결과 확인
           System.out.println("Enter a number : ");
           int num1 = sc.nextInt();

           System.out.println("Enter a number : ");
           int num2 = sc.nextInt();

           //나누기 연산
           int result = num1 / num2;
           System.out.println(result);
       } catch (ArithmeticException e) {
           System.out.println("예외발생 :" + e);
           System.out.println("0으로 숫자를 나눌 수 없습니다.");
           System.out.println("프로그램을 종료합니다.");
       } catch (Exception e) {
           System.out.println(e.getMessage());
           System.out.println("예기치 못한 문제가 발생했습니다. ");
           System.out.println("프로그램을 종료합니다.");
       } finally {
           //catch 와 상관없이 마지막에 무조건 실행하는 코드

       }
    }
}
