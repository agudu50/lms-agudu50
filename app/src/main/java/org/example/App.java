package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize Library and Patron
        Library library = new Library();
        Patron patron = new Patron("John Doe");

        // Adding books to the library
        System.out.println("Adding books to the library...");

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Books have been added to the library.");
        System.out.println();

        // Main menu for user interaction
        while (true) {
            System.out.println("Welcome to the Library System!");
            System.out.println("1. List all books in the library");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. List borrowed books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Books available in the library:");
                    library.listBooks();
                    break;

                case 2:
                    System.out.println("Enter the title of the book to borrow:");
                    String titleToBorrow = scanner.nextLine();
                    boolean bookFound = false;

                    for (Book book : library.getBooks()) { // Use the getter to access books
                        if (book.getTitle().equalsIgnoreCase(titleToBorrow)) {
                            patron.borrowedBooks(book);
                            System.out.println("You borrowed: " + book.getTitle());
                            bookFound = true;
                            break;
                        }
                    }

                    if (!bookFound) {
                        System.out.println("Book not found in the library.");
                    }
                    break;


                case 3:
                    System.out.println("Enter the title of the book to return:");
                    String titleToReturn = scanner.nextLine();
                    boolean returned = false;

                    for (Book book : patron.borrowedBooks) { // Assuming borrowedBooks is public
                        if (book.getTitle().equalsIgnoreCase(titleToReturn)) {
                            patron.returnBooks(book);
                            System.out.println("You returned: " + book.getTitle());
                            returned = true;
                            break;
                        }
                    }

                    if (!returned) {
                        System.out.println("You don't have that book.");
                    }
                    break;

                case 4:
                    System.out.println("Books you have borrowed:");
                    patron.listBorrowBooks();
                    break;

                case 5:
                    System.out.println("Exiting the Library System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            System.out.println();
        }
    }
}
