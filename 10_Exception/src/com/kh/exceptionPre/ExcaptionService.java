package com.kh.exceptionPre;

public class ExcaptionService {

    public void method1(){
        String name1 = "감길자";
        int health1 = 50;

        String name2 = "dudrlfehd";
        int health2 = 80;


        try {
            System.out.println(name1 + name2);

            int avgHealth = (health1 + health2) / 0;
            System.out.println(avgHealth);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("제가 예상한대로 0으로 평균체력나눠서 발생한 사건이 맞군요.");

        } catch (Exception e) {
            System.out.println("어떤 문제인지 어림짐작 할 수는 없지만 문제가 생기긴 했어요");
            System.out.println("문제를 확인하고 개발자분은 해결하시길 바랍니다.");
        }
    }
}
