package com.Library;

public class Book {
    private final int deweyDecimal;
    private final String title;
    private boolean borrowed;

    public Book(int deweyDecimal, String title, boolean borrowed) {
        this.deweyDecimal = deweyDecimal;
        this.title = title;
        this.borrowed = borrowed;
    }

    public int getDeweyDecimal() {
        return this.deweyDecimal;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Title: " + this.title + "\tDewey Decimal Classification: " + this.deweyDecimal + "\tBorrowed: " + this.borrowed;
    }
}
