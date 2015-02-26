package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, welcome to our library!");
        System.out.println("Please, choose an action you would like to take: list of books, checkout book, return book or leave library: ");

        Book book = new Book();
        ArrayList<String> listOfAvailableBooks = new ArrayList<String>();

        String a = "book1";
        String b = "book2";

        listOfAvailableBooks.add(a);
        listOfAvailableBooks.add(b);

        book.listBooks(listOfAvailableBooks);

        book.checkoutBook(a);



    }
}
