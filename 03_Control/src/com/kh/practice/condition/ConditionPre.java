package com.kh.practice.condition;

import java.util.Scanner;

// switch case 로 나이 입력,
//13 이하 어린이
//18이하 청소년
//19세이상 성인 출력
//메소드명은 = methodAge()
public class ConditionPre {
    public void methodAge(){
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해주세요. : ");
        int age = sc.nextInt();

        switch (age/10){
            case 0: case 1:
                System.out.println("어린이 입니다.");
                break;
            case 2:
                if(age <= 18) {
                    System.out.println("청소년 입니다.");
                } else { System.out.println("성인 입니다.");}
                break;
            default:
                System.out.println("성인 입니다.");
                break;
        }

    }

}
