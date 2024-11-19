package com.kh.Loop;

import java.util.Scanner;

public class LoopEx {
    // class 중괄호 가장 바깥에 작성한 변수 = 전역변수 = field = 변수명
    // class 안에서 Method 안에 작성한 변수 = 지역변수
    Scanner sc = new Scanner(System.in);

    /* 앞으로 만드는
    public void 기능명(메서드){}
    public static void main(String[] args){}
    내부에서 sc를 사용 할 수 있음.
    단 ! 한파일당 하나씩 외부파일에서 변수를 사용할때는
    새로 선언해서 사용 (Scanner sc = new Scanner(System.in);)
    */
    public void method1() {
        System.out.println("숫자를 입력하세요.");
        int a = sc.nextInt();

        System.out.println("a값 확인하기 : " + a);

        for (int i = 0; i <= a; i++) {
            System.out.println("i의 값 : " + i);
        }


    }
    /*
     * method2 사용
     * 수입력 2개
     * 첫번째 수부터 1씩증가하며 두번째 숫자까지 출력
     * 만약 두번째 입력값이 첫입력보다 작으면, 첫번째 값은 두번째 값보다 수가 작아야합니다. 출력
     *
     *
     * */

    public void method2() {
        System.out.println("숫자를 입력하세요.");
        int a = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요.");
        int b = sc.nextInt();
        System.out.println("첫번째 입력한 값은 : " + a + "  두번째 입력한 값은 : " + b);

        if (a > b) {
            System.out.println("첫번째 값은 두번째 값보다 작아야합니다.");
        } else if (a == b) {
            System.out.println("두 값이 동일합니다.");
        } else {
            for (int i = a; i <= b; i++) {
                System.out.println("i의 값은 : " + i);
            }
        }


    }

    //10 부터 1까지 1씩 감소하여 출력
    public void method3() {

        for (int i = 10; i >= 0; i--) {
            System.out.println("i의 값 : " + i);
        }

    }

    /*
    method4두 수를 입력 받아서 반복 출력하는 구문을 작성
(첫 번째 입력 A, 두 번째 입력 B)
조건 1 : B가 A보다 큰 경우 -> A ~ B 까지 1씩 증가하며 출력
조건 2 : A가 B보다 큰 경우 -> A ~ B 까지 1씩 감소하며 출력
조건 3 : A와 B가 같다면 -> "같은 수 입력됨"
     */
    public void method4() {
        System.out.print("첫번째 값을 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.print("두번재 값을 입력해주세요 : ");
        int b = sc.nextInt();

        System.out.println("첫번째 값 : " + a + "  두번째 값 : " + b);
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println("i의 값은 : " + i);
            }
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println("i의 값은 : " + i);
            }
        } else {
            System.out.println("같은 수가 입력되었습니다.");
        }


    }
}
