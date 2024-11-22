package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    public static void main(String[] args) {
        PersonPre pp = new PersonPre();

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요 : ");
        String personName = sc.nextLine();
        System.out.println("나이를 입력해주세요 : ");
        int personAge = sc.nextInt();
        //personName.trim().length() == 0
        if (personName.replaceAll(" ", "").isEmpty()){
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
        }else {
            pp.setName(personName);
        }

        if(personAge <= 0){
            System.out.println("나이는 음수일 수 없습니다.");
        } else {
            pp.setAge(personAge);
        }

        if(pp.getAge() <=0 || personName.replaceAll(" ", "").isEmpty()){
            //(pp.getAge() != null &&p.getAge() > 0 )
            System.out.println("저장된 값이 올바르지 않습니다.");
        } else {
            System.out.println("저장된 이름 : "+pp.getName());
            System.out.println("저장된 나이 : "+pp.getAge());
        }

    }
}
