package com.Library;

public class TransactionRecord {
    private final TRDate T_DATE;
    private final String TYPE;
    private final String BOOK_INFO;

    public TransactionRecord(TRDate D, String T, String I) {
        this.T_DATE = D;
        this.TYPE = T;
        this.BOOK_INFO = I;
    }

    public TRDate getT_DATE() {
        return T_DATE;
    }

    @Override
    public String toString() {
        return "Transaction Date: " + this.T_DATE + "\tTransaction Type: "
                + this.TYPE + "\n" + this.BOOK_INFO;
    }
}
