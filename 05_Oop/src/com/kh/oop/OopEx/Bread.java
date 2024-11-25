package com.kh.oop.OopEx;

public class Bread {
    private String breadName;
    private int breadPrice;
    private int quantity;

    //메서드 기본 매개변수 Setter Getter toString


    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBreadName() {
        return breadName;
    }

    public int getBreadPrice() {
        return breadPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    //생성자 기본
    public Bread() {
    }
    //필수
    //필드에 작성한 변수명에 모든값을 넣어야 하는 경우에 필수생성자를 이용해 넣지만, Setter는 개별로 넣어도 되고 넣지 않아도됨
    public Bread(String breadName, int breadPrice, int quantity) {
        this.breadName = breadName;
        this.breadPrice = breadPrice;
        this.quantity = quantity;
    }


    //toString

    @Override
    public String toString() {
        return "Bread{" +
                "breadName='" + breadName + '\'' +
                ", breadPrice=" + breadPrice +
                ", quantity=" + quantity +
                '}';
    }
}


