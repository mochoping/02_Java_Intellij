package com.kh.CollectionEX.pack1.listEx;

public class Snack {
    private String snackName;
    private double snackPrice;
    private int snackQuantity;

    public Snack() {
    }

    public Snack(String snackName, double snackPrice, int snackQuantity) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackQuantity = snackQuantity;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    @Override
    public String toString() {
        return
                "snackName='" + snackName + '\'' +
                ", snackPrice=" + snackPrice +
                ", snackQuantity=" + snackQuantity +
                '}';
    }
}
