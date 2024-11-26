package com.kh.CollectionEX.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClothingStore c = new ClothingStore();
        //1. Scanner
        //2. ClothingStore

        while (true) {
            System.out.println("\n --- 쇼핑몰 옷 관리 프로그램 ---");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 선택  : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    c.addClothing();
                    break;
                case 2:
                    c.allClothing();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return; // while문 종료
                default:
                    System.out.println("1-3사이의 숫자를 입력해주세요.");

            }
        }
    }
}
