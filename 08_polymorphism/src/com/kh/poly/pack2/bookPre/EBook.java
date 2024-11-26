package com.kh.poly.pack2.bookPre;

public class EBook extends Book {

    String filesize;

    public EBook() {
    }
    public EBook(String title, String author, int price, String filesize) {
        super(title, author, price);
        this.filesize=filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public String getFilesize() {
        return filesize;
    }

    @Override
    public String toString() {
        return super.toString() + "filesize='" + filesize;
    }
}
