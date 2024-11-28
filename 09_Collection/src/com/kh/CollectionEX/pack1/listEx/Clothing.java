package com.kh.CollectionEX.pack1.listEx;

public class Clothing {
    private String name;
    private String category;
    private String price;
    // 메서드, 기본메서드 , 필수메서드, 게터 세터 toString


    public Clothing() {
    }

    public Clothing(String name, String category, String price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "옷이름 : " + name +
                ", 카테고리 : " + category +
                ", 옷가격 : " + price +
                "원";
    }
}