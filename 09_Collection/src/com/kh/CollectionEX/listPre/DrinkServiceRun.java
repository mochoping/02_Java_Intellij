package com.kh.CollectionEX.listPre;

import java.util.Scanner;

public class DrinkServiceRun {
    public static void main(String[] args) {
        DrinkService drinkService = new DrinkService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★★★★★★★★음료 공장 메뉴★★★★★★★★★★★");
            System.out.println("1. 음료 추가");
            System.out.println("2. 음료 목록 보기");
            System.out.println("3. 음료 이름으로 검색");
            System.out.println("4. 음료 가격으로 검색");
            System.out.println("5. 음료 삭제하기");
            System.out.println("6. 종료");
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
            System.out.print("원하는 작업번호를 선택하세요");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("-------- 음료 추가하기 ----------");
                    System.out.print("음료 이름을 입력하세요 : ");
                    String name = scanner.nextLine();
                    System.out.print("음료 가격을 입력하세요 : ");
                    int price = scanner.nextInt();
                    drinkService.addDrink(name, price);
                    break;
                case 2:
                    drinkService.allDrinks();
                    break;
                case 3:
                    System.out.print("검색할 음료명을 입력하세요");
                    String name = scanner.nextLine();
                    drinkService.searchDrink(searchName);
                    break;
                case 4:
                    System.out.print("검색할 가격을 입력하세요");
                    int searchPrice = scanner.nextInt();
                    drinkService.searchDrink(searchPrice);
                    break;
                case 5:
                    System.out.print("삭제할 음료 이름을 작성하세요 : ");
                    String deleteName = scanner.nextLine();
                    drinkService.removeDrink(deleteName);
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.print("잘못 번호를 입력했습니다. 다시 입력해주세요.");
                    break;
            }
        }


    }
}
