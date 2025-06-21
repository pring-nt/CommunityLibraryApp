package com.Library;
import java.util.Scanner;

public class MenuUtils {
    public static int displayMainMenu(Scanner scanner) {
        System.out.println("\n\nCommunity Library Tracking System\n\n");
        System.out.println("(1) Display books");
        System.out.println("(2) Display transaction records");
        System.out.println("(3) Borrow book");
        System.out.println("(4) Return book");
        System.out.println("(5) Quit\n");

        System.out.print("Input menu option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public static void handleBookTransaction(Scanner scanner, LibraryTrackingSystem lib, boolean isBorrowing) {
        System.out.println("\n\nSearch using");
        System.out.println("(1) Dewey Decimal Classification");
        System.out.println("(2) Title");
        System.out.println("\n\nInput search option:");
        int searchOption = scanner.nextInt();
        scanner.nextLine();

        TRDate date;

        if (searchOption == 1) {
            System.out.print("Enter Book Dewey Decimal Classification: ");
            int dewey = scanner.nextInt();
            scanner.nextLine();

            date = readDate(scanner);
            if (isBorrowing) {
                lib.borrowBook(dewey, date);
            } else {
                lib.returnBook(dewey, date);
            }

        } else if (searchOption == 2) {
            System.out.print("Enter Book title: ");
            String title = scanner.nextLine();

            date = readDate(scanner);
            if (isBorrowing) {
                lib.borrowBook(title, date);
            } else {
                lib.returnBook(title, date);
            }
        }
    }

    public static TRDate readDate(Scanner scanner) {
        System.out.println("Enter today's date:");
        System.out.print("Day (DD): ");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Month (MM): ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Year (YYYY): ");
        int year = scanner.nextInt();
        scanner.nextLine();

        return new TRDate(day, month, year);
    }
}
