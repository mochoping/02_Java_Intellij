package com.kh.CollectionEX.pack3.mapEX;

import java.util.HashMap;

public class MapExService {


    //1. 번호로 메뉴 추가
    // Arraylist 의 경우 index 0번부터 시작
    // HashMap에서는 1번부터 시작하도록 설정할 수 있음
    public void method1(){
        HashMap<Integer, String> subway = new HashMap<>();

        subway.put(1, "에그마요");
        subway.put(2, "로티세리바베큐");
        subway.put(3, "스테이크앤치즈");
        subway.put(4, "스파이시쉬림프");

        System.out.println("서브웨이 샌드위치 번호와 메뉴명 확인 : "+subway);
    }

}
