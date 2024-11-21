package com.kh.oop.methodPre;

public class Voidpre {

    public void method1(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("섭씨 " + celsius + " 도는 화씨 " + fahrenheit + " 도 입니다.");
    }
    public void method2(String name) {
        System.out.println("학생 이름: " + name);
    }
    public void method3(String name, long price) {
        System.out.println("상품명 : " + name + " , 가격: " + price + "원.");
    }
    public void method4(int minute) {
        int hour = minute / 60;
        System.out.println(minute + "분은 총 " + hour + "시간" + (minute % 60) + " 분 입니다.");
    }
    public void method5(String sport, int time) {
        System.out.println("운동 : " + sport + "지속 시간: " + time + " 분 입니다.");
    }
    public void method6(String number, double degit) {
        System.out.println("계좌번호: " + number + ", 잔액: " + degit);
    }
    public void method7(String title, double stars) {
        System.out.println("영화 제목: " + title + ", 평점: " + stars + "/10");
    }
    public void method8(String cars, int speed) {
        System.out.println("차량명: " + cars + ", 최고 속도: " + speed + "km/h");
    }
    public void method9(String email, String title) {
        System.out.println("수신자: " + email + ", 제목: " + title);
    }
    public void method10(String product, int ea) {
        System.out.println("상품명: " + product + ", 수량: " + ea + "개");
    }

}
