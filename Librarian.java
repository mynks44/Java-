package com.library.models;

public class Librarian extends Member {
    public Librarian(String name, int memberId) {
        super(name, memberId);
    }

    public void addBook(Book book) {
        System.out.println("The book \"" + book.getTitle() + "\" has been added to the library.");
    }

    public void removeBook(Book book) {
        System.out.println("The book \"" + book.getTitle() + "\" has been removed from the library.");
    }
}
