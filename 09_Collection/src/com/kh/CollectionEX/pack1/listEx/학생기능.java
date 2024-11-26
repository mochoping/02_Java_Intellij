package com.kh.CollectionEX.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {

    //학생을 추가하는 addStudent(){}
    // addStudernt 기능을 학생 기능실행에 불러와서 저장된 학생출력
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("학생 학년을 입력하세요 : ");
        int age = sc.nextInt();

        System.out.print("학생 취미을 입력하세요 : ");
        String hobby = sc.nextLine();


        //<학생> 타입으로 ArratList 생성 변수명 std1

        학생 s1 = new 학생(name, age, hobby);
        학생 s2 = new 학생(name, age, hobby);
        학생 s3 = new 학생(name, age, hobby);

        /*
        배열의 순서는 항상 정렬되어 있지 않음

         */
        ArrayList<학생> std1 = new ArrayList<학생>();
        std1.add(s1);
        std1.add(s2);
        std1.add(s3);

        for (int i = 0; i < std1.size(); i++) {
            System.out.println(std1.get(i));
        }
        //향상된 for문 이용
       /* for ( 배열에 들어가있는 값을 하나씩 전달받을 변수명 : 배열이들어있는 변수명) {

       배열에 들어있는 값을 하나씩 전달받을 변수
        */
       for(학생 s : std1) {
           System.out.println(s);
       }
    }

}
