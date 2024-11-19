package com.kh.Loop;

import java.util.Scanner;

public class LoopEx2 {
    Scanner sc = new Scanner(System.in);

    //while 문을 이용해서 false가 될 때까지 계속 실행
    /**
    * 반복문의 한 종류로
    * 특정 조건이 참인동안 계속해서 코드를 실행
    * 특정 조건이 거짓인 경우 반복을 종료
    * while(조건식) {
    조건식이 true 일때 실행되는 코드
     * }
     */
    public void while1() {
        int i = 1; // 초기값
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
    public void while2(){
            boolean xyz = true; //초기값 설정
        while (xyz) {
            System.out.println("현재값 xyz : "+ xyz);
            System.out.println("xyz의 값을 false로 변경하려면 'no'를 입력하세요. ");
            String input = sc.nextLine();

            // .equalsIgnoreCase : Uppercase 나 Lowercase를 사용하지 않고, 대소문자 구분을 없앤체 비교.
            if(input.equalsIgnoreCase("no")){
                xyz = false;
            }

        }
            System.out.println("xyz가 false 로 설정되어 반복이 종료되었습니다.");
    }

        // input 값이 0이되면 종료
    public void while3() {
        System.out.println("=== 0이 되면 종료되는 세상 ===");
        //초기값을 0이 아닌 아무 숫자나 설정
        int input = -1;

        while (input != 0) {
            System.out.println("숫자를 입력하세요. (0을 입력하면 종료) : ");
            input = sc.nextInt();
            System.out.println("입력된 숫자 : " + input);
        }
        System.out.println("프로그램을 종료합니다.");
    }
    // while4 메서드는 abc의 값이 음수값이 되면 종료
    public void while4() {
        System.out.println("=== 음수 입력시 프로그램 종료 ===");
        int abc = 10;

        while (abc >= 0) {
            System.out.print("숫자를 입력해주세요. : ");
            abc = sc.nextInt();
            System.out.println("입력된 숫자 : " + abc);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
