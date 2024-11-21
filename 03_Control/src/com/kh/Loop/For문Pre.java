package com.kh.Loop;

public class For문Pre {
    /*
    향상된 for문을 사용해서
    "사과", "바나나", "체리"
    출력하기
     */
    public void method1(){

        String[] fruits = {"사과", "바나나", "체리"};
        // 주의할 점 : 값이 들어있는 배열과, 변수명은 자료형이 일치해야함
        // fruits 와 fruit 자료형이 다르다면 문자열을 담을 수 없기 때문.
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
    public void method2(){
        int[] numbers = {1,2,3,4,5};

        for(int number : numbers){
            System.out.println(number);
        }
    }



}
