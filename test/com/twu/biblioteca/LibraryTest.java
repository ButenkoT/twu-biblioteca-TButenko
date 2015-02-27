package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook(){
        Library lib = new Library();
        Book book = new Book();
        lib.addBook(book);
        assertTrue(lib.listOfAvailableBooks.contains(book));
    }

    @Test
    public void testSetUpLibrary(){
        Library lib = new Library();
        Book book = new Book();
        book.bookName = "Java";
        book.bookAuthor = "man";
        book.bookYear = "2010";
        lib.listOfAvailableBooks.add(book);
        assertTrue(lib.listOfAvailableBooks.contains(book));
    }

    @Test
    public void testListBooks() {
        Library lib = new Library();
        assertEquals(lib.listOfAvailableBooks, lib.listBooks());
    }

    @Test
    public void checkoutBook(){
        Library lib = new Library();
        Book book = new Book();
        lib.addBook(book);
        lib.checkoutBook(book);
        assertFalse(book.isAvailable);
    }

    @Test
    public void returnBook(){
        Library lib = new Library();
        Book book = new Book();
        lib.addBook(book);
        lib.checkoutBook(book);
        lib.returnBook(book);
        assertTrue(book.isAvailable);

    }

}