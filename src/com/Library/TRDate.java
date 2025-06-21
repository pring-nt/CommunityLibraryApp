package com.Library;

public class TRDate {
    private final int day;
    private final int month;
    private final int year;

    public TRDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

    public int convertNumericalDate() {
        return this.year * 10000 + this.month * 100 + this.day;
    }
}
