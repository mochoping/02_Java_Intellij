package com.kh.CollectionEX.pack2.setEx;

public class Menu {
    private int id;
    private String name;
    private double price;

    public Menu() {
    }

    public Menu(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if(!(o instanceof Menu)) return false;
        return id == Menu.if&& double.compare(price, Menu);

    }*/
}











































































































































