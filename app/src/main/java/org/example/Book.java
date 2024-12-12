package org.example;

public class Book {
    private String title;      // Title of the book
    private String author;     // Author of the book
    private int yearPublished; // Year of publication

    // Constructor to initialize a book with title, author, and year
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "The book title is " + title + ", it was published in " + yearPublished + ", and it was written by " + author;
    }
}
