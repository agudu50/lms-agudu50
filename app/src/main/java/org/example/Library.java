package org.example;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books; // List to store library books

    public Library() {
        books = new ArrayList<>(); // Initialize the list
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        for (int book = 0; book < books.size(); book++) {
            System.out.println(books.get(book));
        }
    }

    // Getter for the books list
    public ArrayList<Book> getBooks() {
        return books;
    }
}
