package com.Library;

public class Book {
    private int deweyDecimal;
    private String title;
    private boolean borrowed;

    public Book(int deweyDecimal, String title, boolean borrowed) {
        this.deweyDecimal = deweyDecimal;
        this.title = title;
        this.borrowed = borrowed;
    }

    public int getDeweyDecimal() {
        return this.deweyDecimal;
    }

    public void setDeweyDecimal(int deweyDecimal) {
        this.deweyDecimal = deweyDecimal;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String convertToString() {
        return "Dewey Decimal Classification: " + this.deweyDecimal + " Title: " + this.title + " Borrowed: " + this.borrowed;
    }
}
