package com.kh;

import java.util.Scanner;

public class ScannerPre3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 키도브로 문자 하나를 입력받아 문자의 유니코드를 출력해라


        System.out.print("문자를 입력하세요.");
        // String text = sc.nextLine(); 여러문자를 가져오는 방법
        // System.out.println("택스트로 입력받은 문자 : " + text);

        char ch = sc.next().charAt(0);// index 기준 작성되지 않은 위치의 번호를 호출하면, 에러문구가 표기
        //문자 ->숫자형식으로 변환
        int changeNum = (int)ch;

        System.out.println("1번 ch 변수값 확인하기 : "+ ch );
        System.out.println("2번 changeNum 변수값 확인하기 : "+ changeNum);


        System.out.print("숫자 1번 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2번 : ");
        int num2 = sc.nextInt();

        System.out.println("숫자 합 : "+ num1+num2);
    }
}
