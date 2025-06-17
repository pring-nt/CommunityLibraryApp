package com.Library;

import java.util.*;

public class LibraryTrackingSystem {
    private ArrayList<Book> books;
    private ArrayList<TransactionRecord> transactionRecords;

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

    public LibraryTrackingSystem(ArrayList<Book> books) {
        this.books = new ArrayList<>();
        this.transactionRecords = new ArrayList<>();

        this.books.addAll(books);
    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<TransactionRecord> getTransactionRecords() {
        return this.transactionRecords;
    }

    public void setTransactionRecords(ArrayList<TransactionRecord> transactionRecords) {
        this.transactionRecords = transactionRecords;
    }

    public void displayBooks() {
        for (Book book : this.books) {
            if (book != null) {
                System.out.println(book.convertToString());
            }
        }
    }

    public void displayTransactionRecords() {
        for (TransactionRecord transactionRecord : this.transactionRecords) {
            if (transactionRecord != null) {
                System.out.println(transactionRecord.convertToString());
            }
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addTransactionRecord(TransactionRecord transactionRecord) {
        this.transactionRecords.add(transactionRecord);
    }

    public void borrowBook(int deweyDecimal, Date date) {
        for (Book book : this.books) {
            if(book != null && deweyDecimal == book.getDeweyDecimal()) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(date, "Borrow", book);
                    addTransactionRecord(transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void borrowBook(String title, Date date) {
        for (Book book : this.books) {
            if(book != null && title.equalsIgnoreCase(book.getTitle())) {
                if(book.isBorrowed()) {
                    System.out.println("This book has already been borrowed!");
                }
                else {
                    System.out.println("Book successfully borrowed!");
                    book.setBorrowed(true);

                    TransactionRecord transactionRecord = new TransactionRecord(date, "Borrow", book);
                    addTransactionRecord(transactionRecord);
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void returnBook(int deweyDecimal, Date date) {
        for (Book book : this.books) {
            if(book != null && deweyDecimal == book.getDeweyDecimal()) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(date, "Return", book);
                    addTransactionRecord(transactionRecord);
                }
                else {
                    System.out.println("This book has already been returned!");
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }

    public void returnBook(String title, Date date) {
        for (Book book : this.books) {
            if(book != null && title.equalsIgnoreCase(book.getTitle())) {
                if(book.isBorrowed()) {
                    System.out.println("Book successfully returned!");
                    book.setBorrowed(false);

                    TransactionRecord transactionRecord = new TransactionRecord(date, "Return", book);
                    addTransactionRecord(transactionRecord);
                }
                else {
                    System.out.println("This book has already been returned!");
                }
                return;
            }
        }

        System.out.println("ERROR! Book not found.");
    }
}
