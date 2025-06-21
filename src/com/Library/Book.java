package com.Library;

public class Book {
    private final int DEWEY_DECIMAL;
    private final String TITLE;
    private boolean borrowed;

    public Book(int deweyD, String T, boolean b) {
        this.DEWEY_DECIMAL = deweyD;
        this.TITLE = T;
        this.borrowed = b;
    }

    public int getDEWEY_DECIMAL() {
        return this.DEWEY_DECIMAL;
    }

    public String getTITLE() {
        return this.TITLE;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Title: " + this.TITLE + "\tDewey Decimal Classification: " + this.DEWEY_DECIMAL + "\tBorrowed: " + this.borrowed;
    }
}
