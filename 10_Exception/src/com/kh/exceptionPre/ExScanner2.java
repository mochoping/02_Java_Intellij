package com.kh.exceptionPre;

import java.util.Scanner;

public class ExScanner2 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
        try {

            System.out.println("=== 게임 케릭터 정보 입력 ===");
            System.out.print("닉네임 : ");
            String nickName = sc.nextLine();
            System.out.print("성별");
            char gender = sc.next().charAt(0);
            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.println("게임 케릭터가 성공적으로 만들였습니다.");
            System.out.println("케릭터 정보 : "+ nickName + " , 성별 : "+ gender+ " , 나이 : "+ age);
        } catch (Exception e) {
            e.printStackTrace();
            /*
            e = exception or error
            print cnffur
            stack 메모리 stack 영역에 존재한,ㄴ
            trace 것을 추적하다

            호출한 기능 순서대로 타고 들어가서 발생한 예외(문제)들을 모두 추적해서
            개발자가 눈으로 확인 할 수 있도록 출력
             */



            System.out.println("케릭터를 만드는 도중 문제가 발생했습니다.");
        } finally {
            sc.close();//검색입력창 종료
            System.out.println("게임을 종료합니다.");

        }



    }


}
