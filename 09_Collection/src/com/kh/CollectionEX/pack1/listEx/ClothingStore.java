package com.kh.CollectionEX.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
    ArrayList<Clothing> wear = new ArrayList<>();
    //옷 추가기능
    public void addClothing() {
        Scanner sc = new Scanner(System.in);
        System.out.print("옷 이름 : ");
        String name = sc.nextLine();

        System.out.print("카테고리 (상의/하의/외투 등) : ");
        String category = sc.nextLine();

        System.out.print("가격 : ");
        String price = sc.nextLine();
        wear.add(new Clothing(name,category,price));
        System.out.println("[ "+ name +" ] 추가 완료!");


    }

    public void allClothing() {
        System.out.println("\n=== 추가된 옷 목록 ===");
        if(wear.isEmpty()){
            System.out.println("등록된 옷이 없습니다.");
        }else {for(Clothing c : wear){
            System.out.println(c);
        }}

    }
}
