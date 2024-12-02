package com.kh.pre;

import java.util.Scanner;

public class toDoListRun {
    private static String PATH = System.getProperty("user.home") + "/Desktop/";
    private static String FILE_NAME = "todolist"; // 기본 파일 이름
    private static String EXT_NAME = ".txt"; // 기본 확장자명

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        toDoList todo = new toDoList();


        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();


        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                FILE_NAME = scanner.nextLine() + EXT_NAME;
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME + EXT_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }


        boolean isTrue = true;
        String filepath =PATH + FILE_NAME;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            String choice = scanner.nextLine();


            switch (firstChoice) {
                case "1":
                    todo.readList(filepath);
                    break;
                case "2":
                    todo.writeList(filepath);
                    break;
                case "3":
                    isTrue = false;
                    return;
                default:
                    System.out.println("1~3사이 숫자를 입력해주세요.");
                    break;


            }
        }
    }
}