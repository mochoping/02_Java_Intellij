package com.kh.CollectionEX.listPre;

import java.util.ArrayList;
import java.util.HashSet;

public class DrinkService {
  private Drink d = new Drink(String name, int price);
   private ArrayList<Drink> drinks = new ArrayList<Drink>();
    public void addDrink(Drink d) {
        drinks.add(d);
            System.out.println("성공적으로 추가되었습니다.");

    }
    //음료이름 가격 모두 조회
    public void allDrinks() {
        if (drinks.size() > 0) {
            System.out.println("등록된 메뉴가 없습니다.");
        } else {

        }
    }
    //4. 특정음료 삭제 ->이름만
    public void removeDrink(String name) {

    }
    //5. 특정음료 검색
    public void searchDrink(String name) {
        for(int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).getName().equals(name)) {
                System.out.println(drinks.get(i).toString());
            }
        }
    }

    //6. 가격을 통해서 음료 검색
    public void searchDrink(int price) {}
}
