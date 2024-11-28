package com.kh.CollectionEX.pack3.mapEX;

import java.util.HashMap;

public class SnackService {

    public void method1(){
        HashMap<String, Integer> snackList = new HashMap<>();
        snackList.put("구름과자", 2000);
        System.out.println(snackList);
    }

    public void method2(){
        HashMap<String, String> lunchList = new HashMap<>();
        lunchList.put("김치찌개","한식");
        lunchList.put("파스타","양식");
        lunchList.put("짜장면","중식");
        lunchList.put("스테이크","양식");
        lunchList.put("비빔밥","한식");

        //점심리스트확인
        System.out.println(lunchList);
        //파스타를 확인했을 때 어떤음식인지 출력
        System.out.println(lunchList.get("파스타"));
        //짜장면제거
        lunchList.remove("짜장면");
        //제거확인
        boolean JJ = lunchList.containsKey("짜장면");
        System.out.println("짜장면 제거 확인"+ JJ);
        //스테이크 -> 한식으로 변경
        lunchList.put("스테이크", "한식");
        System.out.println(lunchList);

        lunchList.replace("스테이크","한식");
        //특정값 변경. put 에 작성된 스테이크의 값을 한식으로 변경 간으
        //점심리스트 모두삭제
        lunchList.clear();
        //삭제확인
        System.out.println("삭제확인"+lunchList);


    }



}
