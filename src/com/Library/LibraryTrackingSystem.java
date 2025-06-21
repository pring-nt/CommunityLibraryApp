package com.Library;

import java.util.*;

public class LibraryTrackingSystem {
    private final ArrayList<Book> books;
    private final ArrayList<TransactionRecord> transactionRecords;

    public LibraryTrackingSystem() {
        this.books = new ArrayList<>();
        this.transactionRecords = new ArrayList<>();

        Book[] tempBooks = new Book[10];
        tempBooks[0] = new Book(398, "The Brothers Grimm Fairy Tales", true);
        tempBooks[1] = new Book(823, "Harry Potter and the Sorcerer's Stone", false);
        tempBooks[2] = new Book(741, "One Piece: Volume 1", true);
        tempBooks[3] = new Book(500, "A Brief History of Time", false);
        tempBooks[4] = new Book(305, "The Second Sex", true);
        tempBooks[5] = new Book(910, "Around the World in Eighty Days", true);
        tempBooks[6] = new Book(1, "Cosmos", false);
        tempBooks[7] = new Book(973, "A People's History of the United States", true);
        tempBooks[8] = new Book(292, "The Odyssey", false);
        tempBooks[9] = new Book(741, "Maus", true);

        this.books.addAll(Arrays.asList(tempBooks));
    }

    public void displayBooks() {
        System.out.println("\nAll books:");
        for (Book book : this.books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void displayAvailableBooks(boolean borrowed) {
        System.out.println("\nAvailable books:");
        for (Book book : this.books) {
            if (book.isBorrowed() == borrowed) {
                System.out.println(book);
            }
        }
    }

    public void displayTransactionRecords() {
        System.out.println("\nTransaction Record:");
        sortTransactionRecord();
        if (this.transactionRecords.isEmpty()) {
            System.out.println("Transaction Records is empty!");
        }
        else {
            for (TransactionRecord transactionRecord : this.transactionRecords) {
                if (transactionRecord != null) {
                    System.out.println(transactionRecord);
                }
            }
        }
    }

    public void addTransactionRecord(TransactionRecord transactionRecord) {
        this.transactionRecords.add(transactionRecord);
    }

    public void borrowBook(int deweyDecimal, TRDate TRDate) {
        for (Book book : this.books) {
            if(book != null && deweyDecimal == book.getDeweyDecimal()) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(TRDate, "Borrow", book);
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void borrowBook(String title, TRDate TRDate) {
        for (Book book : this.books) {
            if(book != null && title.equalsIgnoreCase(book.getTitle())) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(TRDate, "Borrow", book);
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void returnBook(int deweyDecimal, TRDate TRDate) {
        for (Book book : this.books) {
            if(book != null && deweyDecimal == book.getDeweyDecimal()) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(TRDate, "Return", book);
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                else {
                    System.out.println("This book has already been returned!");
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void returnBook(String title, TRDate TRDate) {
        for (Book book : this.books) {
            if(book != null && title.equalsIgnoreCase(book.getTitle())) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(TRDate, "Return", book);
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                else {
                    System.out.println("This book has already been returned!");
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    private void sortTransactionRecord() {
        TransactionRecord temp;
        int min;
        int arraySize = this.transactionRecords.size();
        for (int i = 0; i < arraySize; i++) {
            min = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (this.transactionRecords.get(j).getTransactionDate().convertNumericalDate() > this.transactionRecords.get(min).getTransactionDate().convertNumericalDate()) {
                    min = j;
                }
            }

            if(i != min) {
                temp = this.transactionRecords.get(i);
                this.transactionRecords.set(i, this.transactionRecords.get(min));
                this.transactionRecords.set(min, temp);
            }
        }
    }
}
