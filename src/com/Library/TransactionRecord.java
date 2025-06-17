package com.Library;

public class TransactionRecord {
    private Date transactionDate;
    private String transactionType;
    private Book book;

    public TransactionRecord(Date transactionDate, String transactionType, Book book) {
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
        this.book = book;
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

    public Book getBook() {
        return this.book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String convertToString() {
        return "Transaction Date: " + this.transactionDate.convertToString() + " Transaction Type: "
                + this.transactionType + "\n" + this.book.convertToString();
    }
}
