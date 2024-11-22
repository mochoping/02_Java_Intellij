package com.kh.oop.constructorPre;

public class Cafe {
    //필드
    //메뉴이름 name
    //가격 price
    //주문수량 quantity
    private String name;
    private int price;
    private int quantity;

    //1.기본생성자
    //2.필수생성자
    public Cafe() {
    }

    public Cafe(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //3.setter
    //4.getter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //메서드
    //5.주문 총액 계산 price * quantity
    public int totalPrice() {
        return price * quantity;
    }

    //6.주문 출력 toString @override
    @Override
    public String toString() {
        return "Cafe [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }


}
