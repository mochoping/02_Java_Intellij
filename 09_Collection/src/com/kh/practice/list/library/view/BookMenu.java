package com.kh.practice.list.library.view;

import com.kh.practice.list.library.model.dto.BookPre;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner scanner = new Scanner(System.in);
    ArrayList<BookPre> arrBooks = new ArrayList<BookPre>();

    public void mainMenu() {
        while (true) {
            System.out.println("== Welcome KH Library ==");
            System.out.println("★★★★★★ 메인 메뉴 ★★★★★★");
            System.out.println("1. 새 도서 추가"); // insertBook
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : >> 입력 받음");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    // insertBook
                    break;
                case 2:
                    //searchBook
                    break;
                case 3:
                    //deleteBook
                    break;
                case 4:
                    //ascBooks
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    break;


            }
        }
    }

    public void insertBook() {
        System.out.print("도서명을 입력해주세요 : ");
        String title = scanner.nextLine();
        System.out.print("저자명을 입력해주세요 : ");
        String author = scanner.nextLine();
        System.out.print("카테고리를 다음숫자로 입력해주세요 : (1.인문 / 2.자연과학 / 3.의료 / 4.기타) ");
        int category = scanner.nextInt();
        String categoryName;
        switch (category) {
            case 1:
                categoryName = "인문";
                break;
            case 2:
                categoryName = "자연과학";
                break;
            case 3:
                categoryName = "의료";
                break;
            case 4:
                categoryName = "기타";
                break;
            default:
                System.out.println("다음숫자로 입력해주세요 : (1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
                return;

        }
        System.out.print("가격을 입력해주세요 : ");
        int price = scanner.nextInt();
        arrBooks.add(new BookPre(title, author, category, price));
    }

    public void searchBook() {

    }

    public void deleteBook() {

    }

    public void ascBooks() {

    }


}
