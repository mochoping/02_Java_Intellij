package com.kh.example.practice7.run;

import com.kh.example.practice7.model.Employee;

public class Run {
    public static void main(String[] args) {
        Employee e1 = new Employee(
                100,
                "홍길동",
                "영업부",
                "과장",
                25,
                '남',
                2500000,
                0.05,
                "010-1234-5678",
                "서울시 강남구");
        System.out.println(e1);
    }
}