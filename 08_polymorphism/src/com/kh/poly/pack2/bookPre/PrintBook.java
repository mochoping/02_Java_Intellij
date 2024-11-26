package com.kh.poly.pack2.bookPre;

public class PrintBook extends Book{
    int shippingCost;

    public PrintBook(){}
    public PrintBook(String title, String author, int price, int shippingCost) {
        super(title, author, price);
        this.shippingCost = shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;

    }

    @Override
    public String toString() {
        return "PrintBook{" + super.toString() +
                " shippingCost= " + shippingCost;
    }
}

