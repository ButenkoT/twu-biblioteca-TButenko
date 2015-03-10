package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void TestSetUpLibrary(){
        Library lib = new Library();
        lib.setUpLibrary();

        assertEquals(5, lib.getListOfAvailableItems().size());
    }

    @Test
    public void testAddItem() {
        Library lib = new Library();
        Book book = new Book();

        lib.addItem(book);

        assertTrue(lib.getListOfAvailableItems().contains(book));
    }

    @Test
    public void testSetUpLibrary() {
        Library lib = new Library();
        Book book = new Book();

        book.setTitle("Java");
        book.setAuthor("man");
        book.setYear("2010");
        lib.setListOfAvailableItems(new ArrayList<LibItem>());
        lib.getListOfAvailableItems().add(book);

        assertTrue(lib.getListOfAvailableItems().contains(book));
    }

    @Test
    public void testListItems() {
        Library lib = new Library();
        ArrayList<Book> availableBooks = new ArrayList<Book>();
        Book book = new Book();

        lib.addItem(book);
        availableBooks.add(book);
        assertEquals(availableBooks, lib.listItems());

        book.isAvailable = false;
        assertEquals(new ArrayList<Book>(), lib.listItems());
    }

    @Test
    public void testFindItem(){
        Library lib = new Library();
        Book book = new Book();
        lib.addItem(book);
        book.setTitle("Java");

        assertEquals(book, lib.findItem("Java"));
        assertEquals(null, lib.findItem("Name of the book"));
    }

    @Test
    public void testCheckoutItem() {
        Library lib = new Library();
        Book book = new Book();
        Book someBook = new Book();
        lib.addItem(book);

        lib.checkoutItem(book);
        assertFalse(book.isAvailable);
        assertFalse(lib.checkoutItem(someBook));
    }

    @Test
    public void testReturnItem() {
        Library lib = new Library();
        Book book = new Book();
        Book someBook = new Book();
        lib.addItem(book);
        lib.checkoutItem(book);

        lib.returnItem(book);
        assertTrue(book.isAvailable);
        assertFalse(lib.returnItem(someBook));
    }

}