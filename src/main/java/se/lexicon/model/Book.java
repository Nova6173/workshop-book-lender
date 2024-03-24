package se.lexicon.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;


    public Book(String title) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this.title = title;
        this.author = author;
        this.available = false;
    }
    public String getBookInformation() {
        String borrowerInfo = (borrower != null) ? ", Borrowed by: " + borrower.getPersonInformation () : "";
        return "Title: " + title + ", Author: " + author + borrowerInfo;
    }
}
