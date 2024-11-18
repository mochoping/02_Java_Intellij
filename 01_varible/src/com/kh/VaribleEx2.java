package com.kh;

public class VaribleEx2 {

    // 클래스에서 main으로 작성된 기능이 없으면
    // 출력이 안됨

    // main 메서드
    // 메인 메서드 (프로그램 실행)

    public static void main(String[] args) {System.out.println();
    /*컴퓨터 값 처리 원칙
    * 같은 자료형 끼리 연산, 결과도 같은 자료형
    *
    *
    *  **형변환**
    * - 다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환
    *
    *  *****자동 형변환 *****
    * - 연산시 값의 범위가 작은 자료형을
    *   값 범위가 큰 자료형 변환
    *
    *     * */


        // 자동 형변환 확인 1
        int num1 =9;
        long num2 = 10_000_000_000l;//100억
        // num1과 num2를 합쳐서 담을 경우
        long result1 = num1 + num2;

        // int 자료형 공간에 num1 과 num2 를 합쳐서 담을 것
        // int result2 = num1 + num2;
        // int 보다 큰 int + long 값을 담으려고 했기 때문에 문제발생

        System.out.println(result1);




    }

}
