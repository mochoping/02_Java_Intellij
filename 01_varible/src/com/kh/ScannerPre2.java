package com.kh;

import java.util.Scanner;
//줄바꿈 단축키 alt+shift+↑/↓
public class ScannerPre2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String 이름, int 나이, 취미 입력받기
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        System.out.print("취미를 적어주세요 : ");
        String hobby1 = sc.nextLine();
        String hobby2 = sc.nextLine();
        System.out.print("입력하신 취미는 다음과 같습니다."+hobby1 +hobby2);
        String hobby = hobby1+hobby2;
        System.out.printf("%s는 %d이고 취미로는 %s를 즐깁니다." ,name , age, hobby);
        /*
        *  System.out.println("===== 자기소개 ======");
        *  System.out.println("이름 : "+name);
        *  System.out.println("나이 : "+age);
        *  System.out.println("취미 : "+hobby);
        * */

    }
}
