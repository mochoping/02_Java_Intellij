package com.kh;
/*
 * 범위주석 = 문자로 작성한 설명을 작성
 * */
/**
 * 범위주석 = 클래스 / 메서드 설명용 주석 (html 방식으로 작성 많이함)
 * main 메서드
 * <p>
 * 자바 프로그램을 실행시키기 위해서 반드시 필요한 기능(구문)
 * 실행 단축키 ctrl+shift+f10
 * </p>
 */
// 한줄 주석 :컴파일러가 해석하지 않는 구문

/*
 * html에서는 <!DOCTYPE html> 작성후 <html></html> 로 코딩 작성하는 공간 설정
 * java 에서는 public class 파밀명 {        } 안에 코딩 작성하는 공간 설정
 *
 *
 *
 *
 * */
//왼쪽에 만든 파일명과
//파일명 안에 적힌 public class 적힌 파일명이 다르면 에러 발생함.
public class javaStart{
// 우리가 실행할 기능
    // 자바 코드 실행 방법
    // 1) 위에 Run 버튼 (재생버튼처럼 생신것) 클릭
    // 2) 실행 단축키 : ctrl + f11

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //system.out.println();
        // -> ()안의 문자열을 console에 출력 후 줄바꿈 하는 기능
        //system.out.print(;
        // -> ()안의 문자열을 console에 출력 후 줄바꿈을 하지않고 옆으로 이어 붙여져 출력하는 기능
        // println -> print\n 기호에서 따옴


        // java에서는 ''와 "" 의 차이가 명확함
        // System.out.println(); 안에서는 무조건 "" 사용
        // "" = 문자열 길이 제한 없음
        // '' = 문자
        // 한글자씩 표현할때 사용길이 1문자

        System.out.println("안녕하세요.");
        // sysout 자동으로 System.out.println(); 생성됨
        System.out.println("Java 는 코드 끝에 꼭 세미콜론(;) 을 붙여야 합니다.");
        System.out.println("붙여주지 않을시 에러 발생");

        //숫자 연산의 경우 + 작성할때 ""를 사용하지 않는다.
        System.out.println(200+500);  // 숫자 연산가능

        // 숫자와 문자를 이어 붙일경우.
        // 사칙연산, 괄호 우선


        System.out.println(200+500+"입니다.");

    }
}
