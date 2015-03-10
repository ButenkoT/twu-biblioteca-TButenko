package com.twu.biblioteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tanyabutenko on 10/03/15.
 */
public class TestLibItem {

    @Test
    public void TestGetTitle(){
        Book book = new Book();
        book.setTitle("1984");

        assertEquals("1984", book.getTitle());
    }

    @Test
    public void TestGetAuthor(){
        Book book = new Book();
        book.setAuthor("J");

        assertEquals("J", book.getAuthor());
    }

    @Test
    public void TestGetYear(){
        Book book = new Book();
        book.setYear("2000");

        assertEquals("2000", book.getYear());
    }
}
