import java.util.*;
import com.Library.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryTrackingSystem libraryTrackingSystem = new LibraryTrackingSystem();

        int menuOption;

        do {
            menuOption = MenuUtils.displayMainMenu(scanner);

            switch (menuOption) {
                case 1: // Display books
                    libraryTrackingSystem.displayBooks();
                    break;

                case 2: // Display transaction records
                    libraryTrackingSystem.displayTransactionRecords();
                    break;

                case 3: // Borrow book
                    libraryTrackingSystem.displayAvailableBooks(false);
                    MenuUtils.handleBookTransaction(scanner, libraryTrackingSystem, true);
                    break;

                case 4: // Return Book
                    libraryTrackingSystem.displayAvailableBooks(true);
                    MenuUtils.handleBookTransaction(scanner, libraryTrackingSystem, false);
                    break;
            }
        } while (menuOption != 5);

    }
}
