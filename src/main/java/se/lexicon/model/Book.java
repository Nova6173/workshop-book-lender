package se.lexicon.model;

public class Book {
    private String title;
    private String author;

    // Constructor with title and author parameters
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to get book information
    public String getBookInformation() {
        return "Title: " + title + ", Author: " + author;
    }
}
