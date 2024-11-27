package com.kh.CollectionEX.listPre;

import java.util.ArrayList;
import java.util.HashSet;

public class DrinkService {

    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    public void addDrink(String name, int price) {
        Drink d = new Drink(name, price);
        drinks.add(d);
        System.out.println(name + " 이(가) 추가되었습니다.");
    }

    //음료이름 가격 모두 조회
    public void allDrinks() {
        // 만약에 등록된 메뉴가 없을 경우
        if (drinks.size() > 0) { //하나도 없을때 isEmpty 대신 사용하기도 함
            System.out.println("등록된 메뉴가 없습니다.");
        } else {
            System.out.println("--- 모든 음료 목록 ---");
            for (int i = 0; i < drinks.size(); i++) {
                System.out.println(drinks.get(i).toString());
            }
        }
    }

    //4. 특정음료 삭제 ->이름만
    public void removeDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) { //우리가 검색한 음료이름과 목록에 있는 이름이 일치하다면
                drinks.remove(i); //음료 삭제
                System.out.println("음료를 삭제했습니다.");
            }
        }
    }

    //5. 특정음료 검색
    public void searchDrink(String name) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) {
                System.out.println(drinks.get(i).toString());
            } else {
                System.out.println("상품명과 일치하는 음료가 없습니다.");
            }
        }
    }

    //6. 가격을 통해서 음료 검색
    public void searchDrink(int price) {
        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getPrice() == price) { //우리가 검색하고자 하는 음료 가격이 있다면
                System.out.println(drinks.get(i).toString());  //가격에 맞는 음료 정보를 출력
            } else {
                System.out.println("가격이 일치하는 음료가 없습니다.");
            }

        }
    }
}
