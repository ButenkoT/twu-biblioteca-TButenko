package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void TestSetUpLibrary(){
        Library lib = new Library();
        lib.setUpLibrary();

        assertEquals(3, lib.listOfAvailableBooks.size());
    }

    @Test
    public void testAddBook() {
        Library lib = new Library();
        Book book = new Book();

        lib.addBook(book);

        assertTrue(lib.listOfAvailableBooks.contains(book));
    }

    @Test
    public void testSetUpLibrary() {
        Library lib = new Library();
        Book book = new Book();

        book.setBookTitle("Java");
        book.setBookAuthor("man");
        book.setBookYear("2010");

        lib.listOfAvailableBooks.add(book);


        assertTrue(lib.listOfAvailableBooks.contains(book));
    }

    @Test
    public void testListBooks() {
        Library lib = new Library();
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        Book book = new Book();

        lib.addBook(book);
        availableBooks.add(book);
        assertEquals(availableBooks, lib.listBooks());

        book.isAvailable = false;
        assertEquals(new ArrayList<Book>(), lib.listBooks());
    }

    @Test
    public void testFindBook(){
        Library lib = new Library();
        Book book = new Book();
        lib.addBook(book);
        book.setBookTitle("Java");

        assertEquals(book, lib.findBook("Java"));
        assertEquals(null, lib.findBook("Name of the book"));
    }

    @Test
    public void testCheckoutBook() {
        Library lib = new Library();
        Book book = new Book();
        Book someBook = new Book();
        lib.addBook(book);

        lib.checkoutBook(book);
        assertFalse(book.isAvailable);
        assertFalse(lib.checkoutBook(someBook));
    }

    @Test
    public void testReturnBook() {
        Library lib = new Library();
        Book book = new Book();
        Book someBook = new Book();
        lib.addBook(book);
        lib.checkoutBook(book);

        lib.returnBook(book);
        assertTrue(book.isAvailable);
        assertFalse(lib.returnBook(someBook));
    }

}