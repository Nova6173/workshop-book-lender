package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        Book book = new Book("Mörkrets Herre, Susan Ander");
        // Display book information
        System.out.println("Bok-information: " + book.getBookInformation());
        System.out.println();


        // Create a person instance
        Person person = new Person ("John", "Doe");
        // Display person information
        System.out.println ("Person information: " + person.getPersonInformation ());
        System.out.println ();

        // Loan a book to the person
        person.loanBook (book);

        // Display person information after borrowing a book
        System.out.println ("Person information after borrowing a book");
        // Display book information after borrowing a book
        System.out.println ("Book information after borrowing a book");

        // Return the borrowed book
        person.returnBook (book);

        // Display person information after returning the book
        for (String s : Arrays.asList ("Person information after returning the book", "Book information after returning the book")) {
            System.out.println (s);
        }
        // Display book information after returning the book

    }

}
