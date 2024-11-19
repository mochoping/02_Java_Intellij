package com.kh.condition;

import java.util.Scanner;
/* 조건문 기능용 클래스 */
public class ConditionEx {
    //main 기능이 없기 때문에 실행이 안됨.
    public void 나이확인() {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 확인하기");

        int age = 20;

        if (age < 18) {
            System.out.println("성인이 아닙니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }

    public void scannerAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("나이로 성인인지 판단하기");
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        //입력받는 나이가 19세 이상이라면
        if(age >=19){
            System.out.println("성인입니다.");

        } else {
            System.out.println("성인이 아닙니다.");
        }
    }

    public void methodAge(){
        Scanner sc = new Scanner(System.in);

        System.out.println("*** 세분화된 나이 판단 기능 ***");
        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        if (age <= 13) {
            System.out.println("어린이입니다.");
        } else if (age < 18) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("성인입니다.");
        }



    }

    public void methodMonth(){
        Scanner sc = new Scanner(System.in);

        System.out.println("달을 입력받아 계절 출력하기");
        System.out.print("숫자만 입력 가능합니다 : ");
        int month = sc.nextInt();
        String season ="계절";
        if (month == 12 || month == 1 || month == 2) {
            season = "겨울";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "봄";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "여름";
        } else if (month == 9 || month == 10 || month == 11) {
            season = "가을";
        } else if (month > 12 || month < 0) {
            System.out.println("1-12까지의 월만 가능합니다.");
            return; // 메서드를 종료하고 호출한곳으로 돌아감
        }
        System.out.println("입력하신 "+month+" 의 계절은 "+ season +"입니다.");

    }

    public void switchMonth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("달(월) 입력 : ");
        int month = sc.nextInt();
        String season;
        switch (month) {
            case 1: case 2: case 12:
                season = "겨울";
                        break;
            case 3: case 4: case 5:
                season = "봄";
                break;
            case 6: case 7: case 8:
                season = "여름";
                break;
            case 9: case 10: case 11:
                season = "가을";
                break;
                default:
                    season = "잘못 입력";
                    break;
        }System.out.println(month+" 월은" +  season+" 입니다.");
    }
}
