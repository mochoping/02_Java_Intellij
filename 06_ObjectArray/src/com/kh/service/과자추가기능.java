package com.kh.service;

import com.kh.dto.과자;

public class 과자추가기능 {
    private 과자[] snake;

    {
        {"썬칩", 2000, "매콤한맛"} ,{"고래밥",1000," 고소한맛 "} ,{"포카칩",1500," 생감자맛"}
    }


    private int count;

    public 과자추가기능(int maxSnacks){
        this.count = 0;
        this.snacks = new 과자[maxSnacks];

    }
    public boolean addSnack(String name, int price, String flavor){
        //만약에 과자를 성공적으로 추가했다면
        if(count < snake.length){
            snacks[count++] = new 과자(name, price, flavor); //배열에 과자이름 맛 가격을 추가
            return true;
        }
        return false;
    }



    public 과자[] getSnake() {
        return snake;
    }

    public int getCount() {
        return count;
    }
}

