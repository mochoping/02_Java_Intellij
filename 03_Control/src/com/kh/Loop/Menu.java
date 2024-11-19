package com.kh.Loop;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void order() {
        Boolean is = true;
        int choice = 9;
        int cost = 0;
        String result = "";
        System.out.println("=== 메뉴판 ===");
        System.out.println("1. 아메리카노 - 3000원");
        System.out.println("2. 라떼 - 4000원");
        System.out.println("3. 카푸치노 - 4500원 ");
        System.out.println("4. 주문 종료 ");
        while (is) {
            System.out.print("메뉴를 선택하세요 (1~4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cost += 3000;
                    result = "아메리카노";
                    break;
                case 2:
                    cost += 4000;
                    result = "라떼";
                    break;
                case 3:
                    cost += 4500;
                    result = "카푸치노";
                    break;
                case 4:
                    is = false;
                    System.out.println("주문을 종료합니다.");
                    break;
                default:
                    result = "메뉴에는 없는 숫자";
            }
            System.out.println(result + "를 선택하셨습니다.");

        }

        System.out.println("총 주문 금액: " + cost + " 원 입니다.");

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
