package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testListBooks() {
        Book book = new Book();
        ArrayList<String> listOfAvailableBooks = new ArrayList<String>();
        assertEquals(listOfAvailableBooks, book.listBooks(listOfAvailableBooks));
    }

    @Test
    public void testCheckoutBook() {
        Book book = new Book();
        ArrayList<String> listOfAvailableBooks = new ArrayList<String>();
        String testBook = "TestBook";
        listOfAvailableBooks.add(testBook);
        book.checkoutBook(testBook);
        assertEquals(false, listOfAvailableBooks.contains(testBook));
    }
}