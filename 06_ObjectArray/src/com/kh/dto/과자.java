package com.kh.dto;

public class 과자 {
    private String name;
    private int price;
    private String flavor;

    //기본생성자

    public 과자(String name, int price, String flavor) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    //저장된 과자정보를 볼 수 있는 toString

    @Override
    public String toString() {
        return "과자{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", flavor='" + flavor + '\'' +
                '}';
    }

}
