package com.kh.exceptionEx;
//Exception Handling (예외처리) : Exception 발생시 처리하는 구문
public class ExceptionService {

    public void method1(){

        int[] arr = {1,2,3,4,5};
        //arr.length = 5
        System.out.println(arr.length);
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //컴퓨터가 예기치 못한 상황이 발생했고 해결해달라 구문생성.

        /*
        예외 발생구문을 try-catch로 처리(예외처리)

        -try{} :예외가 발생할 수 있을것 같은 코드들을 시도하는 구문

        -catch(예외){} :
                try 안에 작성한 코드들을 실행하는 도중 문제가 발생했고, 발생한 문제가 예상했던 문제와 같으면 내가 생각한 문제가 맞아!
                catch(잡아서) Catch{}중괄호 안에 작성된 구문 수행
                -> 발생된 예외를 다른 방식으로 처리했기 때문에, 프로그램이 멈추지 않고 정상적으로 수행

                문제발생이 예상되는데,
         */
    }

    // 발생한 문제를 유연하게 처리할 것 try - catch

    public void method2(){
        int[] arr = {1,2,3,4,5};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }



    }


}
