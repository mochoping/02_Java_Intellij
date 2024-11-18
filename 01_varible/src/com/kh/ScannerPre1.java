package com.kh;
/*
* import java.util.Scanner;
* import = 외부폴더나 내부폴더에서 특정 파일을 가져오기
* 폴더명 1. 폴더명2, 파일명;
* 다른 파일에서 특정 파일을 가져와 사용할때는 파일명 맨 앞 글자가 영어로 대문자인지 확인하지
* 파일이름 소문자 작성시 외부파일 가져오기안됨
*
* 자바 자체 라이브러리에 제공하는 파일이름과 동일한 파일이름 만들기 금지. 사용자가 작성한 파일을 먼져 불러와서 작동이 안될 수 있음.
*
*
*
*
* */
import java.util.Scanner;

public class ScannerPre1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //외부에서 가져온 파일명 작성
        //자료횽 뵨슈묭 = 새로운  스캐너 시작(프로그램 내에서 작성한 값 읽기 모드);
        //여러번 쓰는 단어 축약



        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();  // 정수 1번 입력

        /*
         *매번 new Scanner(System.in) 작성이 번거롭기 떄문에
         * 맨 위에 sc라는 변수명으로 스캐너에서 사용자가 키보드로 입력한 값을 시스템 안에다가 스캔해서 전달한다는 기능을
         *  sc 라는 이름으로 줄여서 사용한다는 것
         *
         *
         *
         *
         */

        //
        System.out.println("Enter a number2: ");
         int num2 = sc.nextInt(); // 반드시 next라는 값을 사용하기 전에 프린트로 먼져 출력해서 눈으로 보여주어야 함.

        System.out.println("Enter a number3: ");
        float num3 = sc.nextFloat();

        System.out.println("이름 입력하기 : ");
        String name = sc.next();

        System.out.println("number1: " + num1 + "number2: " + num2 + "number3: " + num3+ "name " +name);

    }
}
