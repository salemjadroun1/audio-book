package com.example.audiobook;

public class book_interface {
    private String name_Author ;
    private String name_book ;
    private String text_desription ;
    private int wajihabook;



    public book_interface(String name_Author, String name_book,String text_desription,int wajihabook) {
        this.name_Author = name_Author;
        this.name_book = name_book;
        this.text_desription=text_desription;
        this.wajihabook=wajihabook;

    }

    public int getWajihabook() {
        return wajihabook;
    }

    public void setWajihabook(int wajihabook) {
        this.wajihabook = wajihabook;
    }

    public String getText_desription() {
        return text_desription;
    }

    public void setText_desription(String text_desription) {
        this.text_desription = text_desription;
    }

    public String getName_Author() {
        return name_Author;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_Author(String name_Author) {
        this.name_Author = name_Author;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }
}
