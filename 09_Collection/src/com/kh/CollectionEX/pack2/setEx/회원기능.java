package com.kh.CollectionEX.pack2.setEx;

import java.util.HashSet;

public class 회원기능 {

    // 회원객체생성 user,
    회원 user = new 회원();
    HashSet<회원> userList = new HashSet<>();
    //추가기능
    public void adduser(){
        //회원이 존재한다면
        if(userList.add(user)){
            System.out.println("성공적으로 추가되었습니다.");
        } else {
            System.out.println("이미 존재하는 회원입니다.");
        }
    }
    //3 회원 모두 조회 가능
    public void allUsers(){
        if(userList.isEmpty()){
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for(회원 user : userList){
                System.out.println(user);
            }
        }
    }
    //4 회원 검색 기능
    public void searchUser(int id){
        for(회원 user : userList){
            if(user.getId() ==id){
                System.out.println(user);
        } else {
                System.out.println("검색하신 회원이 존재하지 않습니다.");
            }
        }
    }
    //5 회원 삭제 기능
    public void delUser(int id){
        for(회원 user : userList){
            if(user.getId() == id){
                userList.remove(user);
                break;
            }
        }
        System.out.println("해당 회원이 삭제 되었습니다.");
    }

}
