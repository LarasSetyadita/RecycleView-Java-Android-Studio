package com.example.recycleactivity;

public class MyBookData {

    private String bookTitle;
    private String bookAuthor;
    private Integer coverBookImage;

    public MyBookData(String bookTitle, String bookAuthor, Integer coverBookImage) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.coverBookImage = coverBookImage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Integer getCoverBookImage() {
        return coverBookImage;
    }

    public void setCoverBookImage(Integer coverBookImage) {
        this.coverBookImage = coverBookImage;
    }
}
