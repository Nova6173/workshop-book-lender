package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // Create a book instance
        Book book = new Book("Mörkrets Herre", "Susan Ander");
        // Display book information
        System.out.println("Book information: " + book.getBookInformation());
        System.out.println();

        // Create a person instance
        Person person = new Person("John", "Doe");
        // Display person information
        System.out.println("Person information: " + person.getPersonInformation());
        System.out.println();

        // Loan a book to the person
        person.loanBook(book);

        // Display person information after borrowing a book
        System.out.println("Person information after borrowing a book: " + person.getPersonInformation());
        // Display book information after borrowing a book
        System.out.println("Book information after borrowing a book: " + book.getBookInformation());
        System.out.println();

        // Return the borrowed book
        person.returnBook(book);

        // Display person information after returning the book
        System.out.println("Person information after returning the book: " + person.getPersonInformation());
        // Display book information after returning the book
        System.out.println("Book information after returning the book: " + book.getBookInformation());
    }
}
