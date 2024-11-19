package com.kh.Loop;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public void order(){
        int choice = 9;
        System.out.println("=== 메뉴판 ===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원 ");
        System.out.println("4. 주문 종료 ");
        while(choice != 4){
            System.out.print("메뉴를 선택하세요 (1~4): ");
            choice = sc.nextInt();
        }
    }
    /*=== 메뉴판 ===
1. 아메리카노 - 3000원
2. 라떼 - 4000원
3. 카푸치노 - 4500원
4. 주문 종료
 메뉴를 선택하세요 (1~4): 1
아메리카노를 선택하셨습니다.
 메뉴를 선택하세요 (1~4): 3
카푸치노를 선택하셨습니다.
 메뉴를 선택하세요 (1~4): 4
주문을 종료합니다.
총 주문 금액: 7500원
* */
}
