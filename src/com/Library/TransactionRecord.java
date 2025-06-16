package com.Library;

public class TransactionRecord {
    private Date transactionDate;
    private String transactionType;

    public TransactionRecord(Date transactionDate, String transactionType) {
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
