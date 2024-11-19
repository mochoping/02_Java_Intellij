package com.variable.practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요: ");
        char text = sc.next().charAt(0);

        int uni = (int)text;

        System.out.println("문자 : " + text);
        System.out.println("유니코드 : " + uni);

        // 스캔이 모두 종료되면 닫아주기
        sc.close(); // 스캐너를 모두 사용하면 닫아주는것이 좋음

    }
}
