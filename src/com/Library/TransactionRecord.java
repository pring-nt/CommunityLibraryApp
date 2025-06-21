package com.Library;

public class TransactionRecord {
    private final TRDate transactionDate;
    private final String transactionType;
    private final Book book;

    public TransactionRecord(TRDate transactionTRDate, String transactionType, Book book) {
        this.transactionDate = transactionTRDate;
        this.transactionType = transactionType;
        this.book = book;
    }

    public TRDate getTransactionDate() {
        return transactionDate;
    }

    @Override
    public String toString() {
        return "Transaction Date: " + this.transactionDate + "\tTransaction Type: "
                + this.transactionType + "\n" + this.book;
    }
}
