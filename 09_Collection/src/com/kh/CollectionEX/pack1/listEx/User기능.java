package com.kh.CollectionEX.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class User기능 {
    //1. 저장된 사용자들을 저장할 목록 생성
    private ArrayList<User> usersList = new ArrayList<>();

    //2. 스캐너 사용
    private Scanner sc = new Scanner(System.in);

    //3. 사용자 추가기능 만들기
    public void addUser(String name,String password,String email) {
        /*System.out.println("등록할 아이디를 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요 : ");
        String password = sc.nextLine();
        System.out.println("이메일주소를 입력해주세요 : ");
        String email = sc.nextLine();*/
      //  User u1 = new User(name,password,email);
        usersList.add(new User(name,password,email));
        System.out.println("[ "+name+" ] 님 등록 완료!");
    }

    //4. 유저목록 조회가기
    public void allusers(){
        System.out.println("\n==== 추가된 사용자 목록 ====");
        //등롣된 사용자가 없습니다.
        if (usersList.isEmpty()) {
            System.out.println("등록된 사용자가 없습니다.");
        } else {
            /*for (User user : usersList) {
                System.out.println(user);
            }*/
            for ( int i = 0; i < usersList.size(); i++ ) {
                System.out.println(usersList.get(i));
            }
        }
        // 있다면 전체 출력
    }/*
    public void removeUser() {
        System.out.println("wprj");
        String username = sc.nextLine();

        boolean found = false;

        for ( int i = 0; i < usersList.size(); i++ ) {
            if(usersList.get(i).getUsername().equals(username)){
                usersList.remove(i);
                System.out.println("삭제가 성공적으로 되었습니다.");
                found = true;
            }
        }
    }*/


}
