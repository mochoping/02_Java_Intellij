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

    public void method5() {
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


    /*달,계절을
     * if문을 switch로 바꾸어 출력
     *
     *
     * */
    public void method4() {
        Scanner sc = new Scanner(System.in);

        System.out.print("1 ~ 12 사이의 정수 입력 : ");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(month + " 월은 겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(month + " 월은 봄입니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(month + " 월은 여름입니다.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(month + " 월은 가을입니다.");
                break;
            default:
                System.out.println(month + " 월은 잘못 입력된 달입니다.");
        }

    }

    public void method10() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("실행할 기능을 선택하세요.");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계절");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    method1();
                    //내부에서만 기능 불러오기를 진행할 때 기능명칭()만 작성해주면 됨
                    // 단 main() 예외적으로 클래스파일명 변수명 = new 클래스파일명();
                    //작성 후 불러우기 가능
                    break;
                case 2:
                    method2();
                    break;
                case 4:
                    method4();
                    break;
                case 5:
                    method5();
                    break;
                    case 3: case 6: case 7: case 8: case 9:
                        System.out.println("기능 준비중입니다.");
                        break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    //while 옆에 true 로 적힌 부분을 변수 isTure에 담아서
                    //추후에 isTure = false 로 표현해서 종료하게 만들기
                    break;
                default:
                    System.out.println("정확한 번호를 입력해주세요.");
            }
        }
    }
}
