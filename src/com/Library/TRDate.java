package com.Library;

public class TRDate {
    private final int DAY;
    private final int MONTH;
    private final int YEAR;

    public TRDate(int D, int M, int Y) {
        this.DAY = D;
        this.MONTH = M;
        this.YEAR = Y;
    }

    @Override
    public String toString() {
        return this.DAY + "/" + this.MONTH + "/" + this.YEAR;
    }

    public int convertNumericalDate() {
        return this.YEAR * 10000 + this.MONTH * 100 + this.DAY;
    }
}
