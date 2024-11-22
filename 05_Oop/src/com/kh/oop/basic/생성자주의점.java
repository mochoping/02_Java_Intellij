package com.kh.oop.basic;

public class 생성자주의점 {

    private String a;
    private String b;
    private int c;
    private int d;
    private char e;

    //생성자
    public 생성자주의점(){}
    public 생성자주의점(String a, String b, int c, int d, char e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    // 매개변수를 원하는 변수의 값만 가져올 수 있도록 설정
    public 생성자주의점(int c, int d){
        this.c = c;
        this.d = d;
    }
    // 컴퓨터는 자료형이 어떻게 들어오는지가 더 중요하게 생각함 즉 자료형이 동일하게 배치되는 생성자는 중복하여 사용하지 못함
    //ex int하나짜리는 변수명되 상관없이 int하나만을 위한 생성자를 중복하여 사용하지 못함. overloading




}
