package com.kh.ex;

import java.util.Scanner;

public class ArrayEx {
    //필드
    Scanner sc = new Scanner(System.in);

    /* 배열 (자료구조)
    *
    * - java에서의 배열
    * -> 배열과 객체로 이루어진게 정말 많다.
    * -> 같은 자료형의 변수를 하나의 묶음으로 다루는것
    *
    * - 생성된 배열의 요소는 index를 이용해서 구분
    *
    * - 생성된 배열을 활용하기 위해서는 배열을 참조하는 "참조형 변수"를 이용
    *
    * [참조형 변수]
    * - 주소를 저장하는 변수
    *
    * - 변수 사용시 저장된 주소로 찾아가서 그곳에 위치한 배열, 객체를 참조
    *
    * - 기본자료형 8 개를 제외한 나머지는 모두 참조형 변수
    *
    * *기본 자료형 = byte, short, int, long, char, boolean, float, double
    *  대표적인 참조 자료형 = String, Scanner, ..이외 우리가 만든 자료형이 될 수 있음
    *  자료형의 맨 앞글자가 소문자로 시작하면 기본자료형
    *  자료형의 맨 앞글자가 대문자로 시작하면 개발자가 만들어 놓은 참조 자료형
    *
    * */
    /*
    * 동일한 타입
    *
    * 자바 배열은 배열안 타입이 모두 동일함.
    *
    * */
    /*
    *   배열 선언, 할당, 초기화
    *
    * */
    public void method1(){

        //변수 선언
        int num;
        //Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성하고
        // 그 변수의 이름을 "num" 으로 지정

        // 배열 선언
        int[] arr;
        // stack 영역에 int[] 자료형을 참조할 변수를 생성하고 (주소저장)
        // 그 변수의 이름을 "arr"로 지정

        // 배열 할당
        arr = new int[4];
        // Heap 영역에 int 10개짜리 배열을 할당한 후
        // 생성된 배열의 주소를 arr 변수에 대입

        // arr 을 이용해서 배열을 참조할 수 있음

        // 배열 초기화

        // 1) 초기화전 -> 0 이 대입되어 있는지 확인
        System.out.println("초기화 전");

        // * bug : 프로그램 수행 중 발생하는 오류 (==error)

        // * debug : 프로그램 수행 중 특정 시점에 어떤 값을 지니고 있는지 확인하는 것
                //  -> 코드 상태, 오류를 분석할 수 있음
        // 2) 인덱스를 이용한 초기화

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 3000;
        arr[3] = 5;

        System.out.println("초기화 후");

        /*
        배열은 Js 와 마찬가지로
        index = 0번부터 시작 각 값의 자리번호를 매긴하는 기능
        length = 1번부터 시작해서 총 길이를 표현하는 기능

            초기화 전
        *    [stack]                            [heap]
        * +------------+                +--------------------+
        * |  arr(주소) |  -------->     |  [0] [1] [2] [3]   |
        * +------------+                |   0   0   0   0    |
        *                               +--------------------+
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 3000;
        arr[3] = 5;

        *    [stack]                            [heap]
        * +------------+                +--------------------+
        * |  arr(주소) |  -------->     |  [0] [1] [2] [3]   |
        * +------------+                |  100 200 3000 5    |
        *                               +--------------------+
        * 초기화 전
        int[] arr; 실행시 :
                -  stack에 arr변수 생성( 주소가 없는 상태 );

        arr = new int[4] 실행시
                - heap 크기 4짜리 배열이 생성되고 초기값은 0으로 설정
                - Heap 에 생성된 배열의 시작주소가 stack 의 arr에 저장됨
                이제 arr은 heap의 배열을 참조할 수 있음.

                결과적으로
                stack : arr 변수는 heap 배열의 주소를 가짐
                heap : 배열이 생성되어 초기화 된 상태

                arr[0] = 100, arr[1] = 200, arr[2] = 3000, arr[3] = 5 값을 넣었을 때
                    - heap에 있는 배열의 각 인덱스에 지정된 값을 저장
                    Stack : arr 변수에는 Heap에 있는 배열의 주소값이 저장됨
                    Heap : 주소가 가리키는 배열이 각 인덱스에 할당된 값을 포함

        *
        *
        *
        *
        *
        *
        *
        *
        *
        * */

    }

    // 배열을 이용해서 Stack과 Heap 비교
    public void method2(){
        int x=10; //Stack에 저장
        int[] arr = new int[3]; //Heap저장
        /*
        * stack : 메모장
        * 간단히 메모하고 지우는 공간
        * 프로그램이 끝나면 메모리도 자동으로 치워짐
        *
        * Heap : 창고
        * 큰물건을 저장하고 , 필요할때 주소를 이용해 꺼내씀
        * 창고에 저장한 물건은 직접 정리를 해야지 나중에 데이터가 어디있는지 알고 찾을 수 있음
        *
        *
        *
        *
        *
        * */

    }

    /*
    * 정수 4개를 입력 받아
    * 배열에 차례대로 대입 후
    * 결과를 확인
    * */
    public void method3(){
        // 배열 선언 + 할당
        //int arr = new int[4];-> 자바에게 값을 담을 공간이 배열형태임을 미리 알려주지 않으면, 에러발생
        // 반드시 int 나 변수명 앞 뒤에 [] 붙여줘야함
        //  단 자료형은 앞에 붙일 수 없음.
        /*가능
        * int[] arr
        * int []arr
        * int arr[]
        * 불가능
        * int arr
        * []int arr
        * 배열이름.length : 배열길이
        * */

        //for 문을 이용해서 i = 0, 1, 2, 3 확인
        int [] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"번째 위치");
        }
    }

    public void method4(){
        int[] arr = {4, 6, 7, 3, 9};

        System.out.print("배열 역순 출력 : "); // 가로 이어쓰기
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }


        System.out.println(arr);
        //[I@5dfcfece 와 같은 주소값 보임 16진수 구분명 [배열시작 I는 정수형

        System.out.println("arr 0 번째 값 " + arr[0]);
        System.out.println("arr 1 번째 값 " + arr[1]);
        System.out.println("arr 2 번째 값 " + arr[2]);
        System.out.println("arr 3 번째 값 " + arr[3]);
        System.out.println("arr 4 번째 값 " + arr[4]);
        //System.out.println("arr 5 번째 값 " + arr[5]);
        //Index 값이 0~4까지 있기 때문에
        //없는 자리를 찾는다는 에러가 발생
    }

    //문자열 배열 출력
    public void method5(){
        String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        // 요일들 모두 for문을 사용하여 출력하기
        for(int i = 0; i < days.length; i++){// size 와 length는 같음
            System.out.print(days[i]);

        }
}}



