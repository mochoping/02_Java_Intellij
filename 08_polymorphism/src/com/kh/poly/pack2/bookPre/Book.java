package com.kh.poly.pack2.bookPre;

public class Book {
    String title;
    String author;
    int price;

    public Book(){}
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "title='" + title +
                ", author='" + author +
                ", price=" + price +" ";
    }

    /*
    부모클래스에서 toString이 없다면 주소값이 나가게됨.
     */
}
