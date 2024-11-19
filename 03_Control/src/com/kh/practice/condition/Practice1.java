package com.kh.practice.condition;

import java.util.Scanner;

public class Practice1 {
    public void method1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 메뉴 ====");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요. :  ");

        String result = "선택";
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                result = "입력";
                break;
            case 2:
                result = "수정";
                break;
            case 3:
                result = "조회";
                break;
            case 4:
                result = "삭제";
                break;
            case 5:
                result = "종료";
                break;
            default:
                System.out.println("잘못된 번호를 입력하셨습니다.");
                break;
        }
        System.out.println(result + " 메뉴입니다.");

    }

    public void method2() {
        //키보드로 입력받는 정수가 앙수이면서 짝수일때만 짝수입니다.
        //키보드로 입력반는 정수가 양수미녕서 홀수일때만 홀수입니다.

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력해주세요. : ");
        int choice = sc.nextInt();
        String result = "홀짝";

        if (choice < 0) {
            System.out.print("양수로 입력해주세요.");

        } else {
            switch (choice % 2) {

                case 0:
                    result = "짝수";
                    break;
                case 1:
                    result = "홀수";
                    break;
            }
            System.out.print(result + " 입니다. ");
        }

    }

    public void method3() {
        //로그인 기능
        //id myId
        //pw myPassword12

        Scanner sc = new Scanner(System.in);

        System.out.println("==== 로그인 ====");
        System.out.print("아이디를 입력해주세요. : ");
        String choiceId = sc.next();

        if (choiceId.equals("myId")) {
            System.out.print("비밀번호를 입력해주세요. : ");
            String choicePw = sc.next();
            if (choicePw.equals("myPassword12")) {
                System.out.print("로그인 성공");
            } else {
                System.out.print("비밀번호를 잘못입력하셨습니다. ");
            }

        } else {
            System.out.println("아이디를 확인해주세요.");
        }






    }
}
