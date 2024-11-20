package com.kh.practice;

import java.util.Scanner;

public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);

    /*배열크기 입력받고 그만큼 출력*/
    public void practice3() {

        System.out.print("배열 크기 입력 :");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("양의 정수를 입력하세요. : ");
            return;
        }
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i + 1; // 1부터 size 까지 호출
        }

        //배열출력
        for (int i = 0; i < arr.length; i++) {// size 와 length는 같음
            System.out.print(arr[i] + " ");
        }
        /*System.out.println("배열 크기 입력 : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++);
        System.out.println(i +" 번재 위치");*/


    }

    /*
    길이가 5dls String 배열을 선언하고
    "사과","귤","포도","복숭아","참외" 로 초기화 한후
    배열인덱스 활용해서 귱 출력하기
     */
    public void practice4() {
        String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println("배열 0 에서 출력한 값 : " + fruit[0]);
        System.out.println("배열 1 에서 출력한 값 : " + fruit[1]);
        System.out.println("배열 2 에서 출력한 값 : " + fruit[2]);
        System.out.println("배열 3 에서 출력한 값 : " + fruit[3]);
        System.out.println("배열 4 에서 출력한 값 : " + fruit[4]);

    }


    /*주민등록 번호를 입력받아 char배열에 저장한 후 출력하세요.
    단 char 배열 저장시 성별을 나타내는 숫자 이후부터 * 로 저장하세요.
     *
    * */
    public void practice5() {
        //저장할 배열생성
        char[] arr = new char[14]; // -까지 합쳐서 총 14자리

        System.out.print("주민번호(-)포함 입력해 주세요 : ");
        String num = sc.nextLine();

        //문자열.length() : 문자열 길이는 반환하는 매서드
        //배열.length() : 배열길이를 반환하는 필드
        int len = num.length();
        for (int i = 0; i < len; i++) {
            //성별 전까지는 그대로 저장 7까지는.
            if (i <= 7) {
                //charAt = 문자열에서 특정 위치를 반환
                arr[i] = num.charAt(i);
            } else {
                // 8번 부터는 별로 저장
                arr[i] = '*';
            }
        }
        //for문 종료후 배열 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * practice6A()
     * 전화번호를 입력 받아 char 배열에 저장한 후 출력
     * 단, 전화번호의 앞 3자리(국가 코드 포함)는 그대로 출력하고
     * 나머지 뒷자리 숫자는 '*' 로 출력
     * 입력 예시 : +82-010-1234-5678
     * 출력 예시 : +82-010-*********
     */
    public void practice6() {
        char[] arr = new char[17];

        System.out.print("전화번호를 (-,+)포함하여 입력해주세요.");
        String num = sc.nextLine();
        int len = num.length();
        for (int i = 0; i < len; i++) {
            if (i <= 7) {

                arr[i] = num.charAt(i);
            } else {
                arr[i] = '*';
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice6A() {
        //전화번호를 저장할 char 배열 생성
        char[] arr = new char[17];
        System.out.print("전화번호(-포함):");
        String input = sc.nextLine();
        int len = input.length();

        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < len; i++) {
            // 앞 숫자들은 그대로 배열에 대입
            // 뒷자리는 *로 대입

            if (i <= 7) {
                arr[i] = input.charAt(i);
            } else {
                arr[i] = '*';
            }
        }

        // 배열에 담긴 내용 모두 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* 국가번호
     * +82- 고정
     * 사람들이 작성한 핸드폰 번호만 이어서 출력
     *
     * */
    public void practice6B() {

        // +82- 고정, 나머지 번호를 입력받아 이어 작성
        String countryCode = "+82-";

        System.out.print("전화번호(-포함):");
        String input = sc.nextLine();

        // 전화번호 전체 길이를 계산하기 위해 국가번호 + 핸드폰번호 합치기
        String fullNumber = countryCode + input; //+82-포함한 전체번호

        // 전화번호를 저장할 char 배열 생성
        char[] arr = new char[fullNumber.length()]; // 전화번호 전체길이크기가 반영된 배열 생성


        //문자열 길이와 char 배열 길이 활용
        for (int i = 0; i < fullNumber.length(); i++) {
            // 앞 숫자들은 그대로 배열에 대입
            // 뒷자리는 *로 대입

            if (i <= 7) {
                arr[i] = fullNumber.charAt(i);
            } else {
                arr[i] = '*';
            }
        }

        // 배열에 담긴 내용 모두 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

