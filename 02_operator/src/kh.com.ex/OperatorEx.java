package kh.com.ex;

import java.util.Scanner;

/*
사칙연산 기능만 들어있는 클래스
 */
public class OperatorEx {
    // 맨 첫글자는 변수, 매서드명, 클래스명 전부 숫자를 넣을 수 없다.

    //public static void main(String[] args) {}
    /*최종으로 출력하는 메인 기능에 내가 원하는 기능만 출력하고자 할 때 작성하는 기능

    public void 기능 명칭(){}
    각 원하는 기능별로 묶어서 main 기능에서 출력하고자 하는 기능만 선택해서 출력
    */
    public void 삼의배수가맞는지확인하는기능() {
        /*입력 받은 정수가  3의 배수가 맞는지 확인*/
        //Scanner 생성 import java.util.Scanner;
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 하나를 입력하세요: ");
        int a = sc.nextInt();
        /*
        * == ( Equal to, 같음)
        * 부등호를 기준으로 좌 우에 있는 값이 같은지 다른지, 같으면 true, 다르면 false
        *
        * != ( Not Equal to, 다름)
        * 부등호를 기준으로 좌 우에 있는 값이 다른 값을 가지고 있는지 확인
        *
        * int a =5;
        * int b =5;
        * int c =10;
        *
        * a==b true
        * a==c false
        *
        * a!=c true
        * a!=5 false a와 숫자 5의 값이 같기 때문
        *
        * */
        boolean tf = a % 3 == 0;

        System.out.println("입력한 숫자는 3의 배수인가 : "+ tf);




    }

    public void 이의배수가맞는지확인하는기능() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력하세요 : ");
        int a = sc.nextInt();
        // 2의 배수가 맏으면 true
        boolean tf = a % 2 == 0;
        System.out.println("2의 배수인가 : " + tf);
    }
}