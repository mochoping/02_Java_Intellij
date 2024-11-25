package com.kh.run;

import com.kh.dto.과자;
import com.kh.service.과자추가기능;
import com.kh.view.과자정보출력;

public class 과자기능실행 {

    public static void main(String[] args) {

        String compayName = "맛나 과자";

        int maxSnacks = 5;
         //과자 추가기능 과자정보출력 가져오기
        과자추가기능 service = new 과자추가기능(maxSnacks);

        과자정보출력 view = new 과자정보출력();

        view.추가결과(service.addSnack("초코칩쿠기", 1500, "달콤한초코맛"));
        view.추가결과( service.addSnack("초코칩쿠기", 1500, "달콤한초코맛"));
        view.추가결과( service.addSnack("허니버터칩", 1200, "달콤한버터맛"));
        view.추가결과( service.addSnack("새우강", 1200, "짤짤한새우맛"));
        view.추가결과( service.addSnack("고구마칩", 1800, "달콤한고구마맛"));
        view.추가결과( service.addSnack("감자칩", 1500, "고소한감자맛"));
        view.추가결과(service.addSnack("치즈볼", 1900, "고소한치즈맛"));



        view.과자리스트출력(compayName,service.getSnake(),service.getCount());

    }
}
