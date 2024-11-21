package com.kh.ex;

public class ArrayEx3 {
    //heap에 저장되어있는 기능
    public void method1() {
        /*
        이차원 배열은 배열안애 배열이 있는 형태로,
        배열의 배열
        행(row)와 열(colum) 구성된 데이터 구조
        표나 행렬의 형태로 데이터를 저장할 때 사용

         배열의 차원 :
                - 배열이 몇 개의 차원으로 구성되어 있는지에 따라 다름
                - 1차원 배열은 단순히 값들이 일렬로 나열된 배열
                - 2차원 배열은 여러개의 1차원 배열이 모여서 하나의 큰 배열을 이루는 구조

         배열의 선언 :
         배열 선언 및 초기화 : 타입[][] 배열명 = new 타입[행의개수][열의개수];
                             : 타입 [][]배열명 = new 타입[행의개수][열의개수];
                             : 타입 배열명[][] = new 타입[행의개수][열의개수];
                             : [][]타입 배열명 = new 타입[행의개수][열의개수]; 불가능


         */

    }

    // 학생 1,2,3의 국어 영어 수학 과학 성적
    public void method2() {
        int[][] grades = {{90, 85, 88, 92}, //학생1
                {78, 82, 79, 85}, //학생2
                {88, 90, 92, 85}};//학생3
        //학생별 성적을 직접 인덱스로 접근해서 출력
        System.out.println("===== 학생 1 의 성적 =====");
        System.out.println("학생 1 의 국어 성적 : " + grades[0][0]);
        System.out.println("학생 1 의 영어 성적 : " + grades[0][1]);
        System.out.println("학생 1 의 수학 성적 : " + grades[0][2]);
        System.out.println("학생 1 의 과학 성적 : " + grades[0][3]);


        System.out.println("===== 학생 2 의 성적 =====");
        System.out.println("학생 2 의 국어 성적 : " + grades[1][0]);
        System.out.println("학생 2 의 영어 성적 : " + grades[1][1]);
        System.out.println("학생 2 의 수학 성적 : " + grades[1][2]);
        System.out.println("학생 2 의 과학 성적 : " + grades[1][3]);


        System.out.println("===== 학생 3 의 성적 =====");
        System.out.println("학생 3 의 국어 성적 : " + grades[2][0]);
        System.out.println("학생 3 의 영어 성적 : " + grades[2][1]);
        System.out.println("학생 3 의 수학 성적 : " + grades[2][2]);
        System.out.println("학생 3 의 과학 성적 : " + grades[2][3]);
    }

    //3개의 과일과 그 과일의 색상 , 맛, 크기 정보를 저장하는 이차원 배열
    public void method3() {
        String[][] fruits = {
                {"사과", "빨강", "단맛", "중간"},   // 사과정보가 들어있는 index 0
                {"귤", "오렌지", "세콤", "작음"}, // 귤정보가 들어있는 index 1
                {"포도", "보라", "달콤", "작음"}    // 포도정보가 들어있는 index 2
        };
        //각 과일의 정보 출력
        System.out.println("과일1 : " + fruits[0][0] + " (색상 : " + fruits[0][1] + " , 맛 : " + fruits[0][2] + ", 크기 :" + fruits[0][3] + ")");
        System.out.println("과일2 : " + fruits[1][0] + " (색상 : " + fruits[1][1] + " , 맛 : " + fruits[1][2] + ", 크기 :" + fruits[1][3] + ")");
        System.out.println("과일3 : " + fruits[2][0] + " (색상 : " + fruits[2][1] + " , 맛 : " + fruits[2][2] + ", 크기 :" + fruits[2][3] + ")");

        // 없는 자리에 값을 가져오려고하면 바로 에러


    }
}
