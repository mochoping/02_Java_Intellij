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



    }
}
