package com.kh.CollectionEX.pack1.listEx;
// 컬렉션 프레임워크 : java에서 자료구조를 만들어서 모아둔 것
// java.util 폴더 안에 있음

import java.util.ArrayList;

//특징
//1) 크기제한없음(부족하면 자동으로 증가)
//2) 추가 수정 삭제 검색 등 다양한 기능이 구현되어 있음
public class BookService {

    // List : 자료를 순차적으로 나열한 자료 구조 (배열과 비슷)
    // - 인덱스가 존재함
    //     -> 인덱스로 순서가 구분되기 때문에 중복 데이터 저장 가능

    /*
     * List 사용해보기
     * */
    public void method1() {
        // List 객체 생성
        //  - List (인터페이스)  -> 객체로 보기 어려움. 객체생성 불가 -> 다형성 이용
        //    List 기능을 물려받은 ArrayList (클래스) 활용
        int arr1[] = new int[3]; // 정수 3개의 값만 들어갈 수 있음
        String arr2[] = new String[3]; // 문자열 3개의 값만 들어갈 수 있음.
        arr1[0] = 01;


        // list1은 모든값을 넣을 수 있음
        ArrayList list1 = new ArrayList(3);

        list1.add(1);
        list1.add("아무거나 넣을 수 있어요.");
        list1.add(123);
        list1.add(false); //불리언자료형, 자동으로 칸 늘어남.
        System.out.println(list1);


    }

    public void method2() {

        //원하는 자료형만 넣을 수 있도록 제한 설정하기
        /*ㄴ
         * String 타입으로 제한된 ArrayList 객체 생성
         * 개발자가 담길 원하는 타입을 제한했다면 앞뒤로 완벽하게 해당 타입만을 사용하도록 작성요망/ 실행은 다됨
         * ArrayList<원하는 자료형> list1 = new ArrayList<원하는 자료형>();
         * ArrayList list1 = new ArrayList<원하는 자료형>();
         * ArrayList list1<원하는 자료형> = new ArrayList<>();
         *
         *
         * */

        ArrayList list1 = new ArrayList<String>();

        list1.add("닭갈비");
        list1.add("치킨");
        list1.add("보쌈");
        //list1.add(1122); // 문제가 지금 되지 않지만, 추후 코드 흐름에서 문제가 될 가능성이 큼
        list1.add("족발");

        System.out.println(list1);
        System.out.println(list1.size());

    }

    public void method3() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("intList : " + intList);

        // 문자타입 제한
        ArrayList<Character> charList = new ArrayList<Character>();
        charList.add('a');
        charList.add('나');
        charList.add('c');
        charList.add('라');
        System.out.println("charList : " + charList);
        //3 . 논리 타입 제한 리스트에 저장 boolList
        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        boolList.add(true);
        boolList.add(false);
        boolList.add(false);
        boolList.add(false);
        System.out.println("boolList : " + boolList);

        //4 . 실수 타입 제한 doubleList
        ArrayList<Double> doubleList = new ArrayList<Double>();
        // 1.5 3.14 값 저장
        doubleList.add(1.5);
        doubleList.add(3.14);
        doubleList.add(7.89123);
        System.out.println("doubleList : " + doubleList);


    }

    //책을 추가할 수 있도록;
    private ArrayList<Book> bookList = new ArrayList<>();

    //한번에 책이름 저자 가격을 저장하고 볼 수 있도록 설정
    //1. 책 추가하기 기능 만들자
    public void addBook(String title, String auther, int price) {


         Book b1 = new Book(title, auther, price);
         bookList.add(b1);
        // 고객이 입력한 값을 받아서 저장하겠다 설정
        // bookList.add(new Book(title, auther, price));
        System.out.println(bookList);
        System.out.println("책이 성공적으로 추가되었습니다.");

    }
    public ArrayList<Book> getBookList() {
        return bookList;
    }

}
