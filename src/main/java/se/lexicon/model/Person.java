package se.lexicon.model;

import java.util.UUID;


public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private UUID uuid;

    public Person(String firstName, String lastName) {
        this.id = ++sequencer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = UUID.randomUUID ();
    }

    private int getNextId() {
        return ++sequencer;
    }
    public void loanBook(Book book) {

    }
    public void returnBook(Book book) {

    }
    public String getPersonInformation() {

        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }

    public UUID getUuid() {
        return uuid;
    }

}