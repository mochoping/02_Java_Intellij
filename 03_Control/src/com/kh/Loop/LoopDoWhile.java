package com.kh.Loop;

import java.util.Scanner;

public class LoopDoWhile {
    /*
    do-while 문
    - 조건식이 뒤에 작성된 while문
    - 무조건 1회 이상의 반복 보장
     */

    /*
     * 기능(method, 메소드)
     * method1() 기능은
     * do-while을 이용해서 0이 입력될때까지 정수를 계속 입력 받고
     * 0 입력 시 누적된 합계 출력
     *
     *
     * */
    public void method1(){
        int sum = 0; // 합계 누적용 변수
        int input = 0; // 입력한 값을 저장하는 변수

        do { // while 문을 시작하기전에 한번 무조건 실행하는 공간. // 입력한 값이 0이 아닐때만 반복
            System.out.println("정수입력 : ");
            Scanner sc = new Scanner(System.in); 
            input = sc.nextInt(); // 입력한 정수 가져오기
            sum += input; // 입력한 수를 sum 변수에 더하기 진행
                            // sum누적 값과 상관없이 들어온값이 0이면 종료
        }while (input != 0);
        //input의 값이 0이 아닐 때 do {}기능을 계속 실행
        System.out.println("합계: " + sum);
    }

}
