package com.kh.poly.pack2.maver;

public class 메이버카페 extends 메이버회원 {

    //카페권한
    //가입카페명
    private String 카페권한;
    private String 가입카페명;

    public 메이버카페() {
    }

    public 메이버카페(String 유저이름, String 유저번호, String 유저주소, String 유저나이, String 카페권한, String 가입카페명) {
        super(유저이름, 유저번호, 유저주소, 유저나이);
        this.카페권한 = 카페권한;
        this.가입카페명 = 가입카페명;
    }

    public String get카페권한() {
        return 카페권한;
    }

    public void set카페권한(String 카페권한) {
        this.카페권한 = 카페권한;
    }

    public String get가입카페명() {
        return 가입카페명;
    }

    public void set가입카페명(String 가입카페명) {
        this.가입카페명 = 가입카페명;
    }



    @Override
    public String toString() {
        return "메이버카페{" + super.toString()+'\'' +
                "카페권한='" + 카페권한 + '\'' +
                ", 가입카페명='" + 가입카페명 + '\'' +
                '}';
    }
}
