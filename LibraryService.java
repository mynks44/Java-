package com.library.services;

import com.library.models.Book;
import com.library.models.Member;

public class LibraryService {
    public void printBookDetails(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Is Borrowed: " + book.isBorrowed());
    }

    public void printMemberDetails(Member member) {
        System.out.println("Name: " + member.getName());
        System.out.println("Member ID: " + member.getMemberId());
    }
}
