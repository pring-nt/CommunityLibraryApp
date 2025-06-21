package com.Library;

import java.util.*;

public class LibraryTrackingSystem {
    private final ArrayList<Book> BOOKS;
    private final ArrayList<TransactionRecord> TRANSACTION_RECORDS;

    public LibraryTrackingSystem() {
        this.BOOKS = new ArrayList<>();
        this.TRANSACTION_RECORDS = new ArrayList<>();

        Book[] tempBooks = new Book[10];
        tempBooks[0] = new Book(398, "Minecraft: Guide to Survival", true);
        tempBooks[1] = new Book(823, "Charlotte's Web", false);
        tempBooks[2] = new Book(741, "Dog Man: Brawl of the Wild", true);
        tempBooks[3] = new Book(500, "Coding for Kids: Python", false);
        tempBooks[4] = new Book(305, "What If You Had Animal Teeth?", true);
        tempBooks[5] = new Book(910, "Magic Tree House: Dinosaurs Before Dark", true);
        tempBooks[6] = new Book(1, "Minecraft: Redstone Handbook", false);
        tempBooks[7] = new Book(973, "If You Lived When There Was Slavery in America", true);
        tempBooks[8] = new Book(5, "How to Code a Sandcastle", false);
        tempBooks[9] = new Book(741, "Amulet: The Stonekeeper", true);

        this.BOOKS.addAll(Arrays.asList(tempBooks));
    }

    public void displayBooks() {
        System.out.println("\nAll books:");
        for (Book book : this.BOOKS) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void displayAvailableBooks(boolean b) {
        System.out.println("\nAvailable books:");
        for (Book book : this.BOOKS) {
            if (book.isBorrowed() == b) {
                System.out.println(book);
            }
        }
    }

    public void displayTransactionRecords() {
        System.out.println("\nTransaction Record:");
        sortTransactionRecord();
        if (this.TRANSACTION_RECORDS.isEmpty()) {
            System.out.println("Transaction Records is empty!");
        }
        else {
            for (TransactionRecord transactionRecord : this.TRANSACTION_RECORDS) {
                if (transactionRecord != null) {
                    System.out.println(transactionRecord);
                }
            }
        }
    }

    public void addTransactionRecord(TransactionRecord T) {
        this.TRANSACTION_RECORDS.add(T);
    }

    public void borrowBook(int deweyD, TRDate D) {
        for (Book book : this.BOOKS) {
            if(book != null && deweyD == book.getDEWEY_DECIMAL()) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(D, "Borrow", book.toString());
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void borrowBook(String T, TRDate D) {
        for (Book book : this.BOOKS) {
            if(book != null && T.equalsIgnoreCase(book.getTITLE())) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(D, "Borrow", book.toString());
                    addTransactionRecord(transactionRecord);
                    System.out.println("\n" + transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void returnBook(int deweyD, TRDate D) {
        for (Book book : this.BOOKS) {
            if(book != null && deweyD == book.getDEWEY_DECIMAL()) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(D, "Return", book.toString());
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

    public void returnBook(String T, TRDate D) {
        for (Book book : this.BOOKS) {
            if(book != null && T.equalsIgnoreCase(book.getTITLE())) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(D, "Return", book.toString());
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
        int arraySize = this.TRANSACTION_RECORDS.size();
        for (int i = 0; i < arraySize; i++) {
            min = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (this.TRANSACTION_RECORDS.get(j).getT_DATE().convertNumericalDate() > this.TRANSACTION_RECORDS.get(min).getT_DATE().convertNumericalDate()) {
                    min = j;
                }
            }

            if(i != min) {
                temp = this.TRANSACTION_RECORDS.get(i);
                this.TRANSACTION_RECORDS.set(i, this.TRANSACTION_RECORDS.get(min));
                this.TRANSACTION_RECORDS.set(min, temp);
            }
        }
    }
}
