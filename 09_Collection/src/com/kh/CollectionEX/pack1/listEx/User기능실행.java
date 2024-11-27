package com.kh.CollectionEX.pack1.listEx;

import java.util.Scanner;

public class User기능실행 {
    public static void main(String[] args) {
        //1.Scanner
        Scanner sc = new Scanner(System.in);
        User기능 userStore = new User기능();

        while (true) {
            System.out.println("\n ---- 사용자 관리 프로그램 ----");
            System.out.println("1. 사용자 추가");
            System.out.println("2. 추가된 유저 목록 모두 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();//잔여 줄바꿈 지우기

            switch (choice) {
                case 1:
                    System.out.println("등록할 아이디를 입력해주세요 : ");
                    String name = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요 : ");
                    String password = sc.nextLine();
                    System.out.println("이메일주소를 입력해주세요 : ");
                    String email = sc.nextLine();
                    userStore.addUser(name,password,email);
                    break;
                case 2:
                    userStore.allusers();
                    break;
                case 3:
                    System.out.println("프로그램이 종료됩니다. ");
                    return;
                default:
                    System.out.println("1-3 사이의 숫자를 입력해주세요.");

            }
        }
    }
}
