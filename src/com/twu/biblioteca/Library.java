package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by tetianabutenko on 26/02/2015.
 */
public class Library {

    ArrayList<Book> listOfAvailableBooks;

    public Library() {
        this.listOfAvailableBooks = new ArrayList<Book>();
    }

    public void setUpLibrary(){
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.bookName = "To Kill the Mockingbird";
        book1.bookAuthor = "Harper Lee";
        book1.bookYear = "1960";

        book2.bookName = "Emma";
        book2.bookAuthor = "Jane Austen";
        book2.bookYear = "1815";

        book3.bookName = "Dracula";
        book3.bookAuthor = "Bram Stoker";
        book3.bookYear = "1897";

        this.listOfAvailableBooks.add(book1);
        this.listOfAvailableBooks.add(book2);
        this.listOfAvailableBooks.add(book3);

        System.out.println("Hello, welcome to our library!");
        System.out.println("Please, choose an action you would like to take: list of books, checkout book, return book or leave library: ");

    }

    public void addBook(Book book){
        this.listOfAvailableBooks.add(book);
    }

    public ArrayList<Book> listBooks(){

        for(Book oneBook : this.listOfAvailableBooks){
            if(oneBook.isAvailable){
                System.out.println(oneBook.bookName);
            }
        }
        return this.listOfAvailableBooks;
    }

    public boolean checkoutBook(Book book){
        if(this.listOfAvailableBooks.contains(book) && book.isAvailable == true){
            book.isAvailable = false;
            return true;
        }

        return false;
    }

    public boolean returnBook(Book book){
        if(this.listOfAvailableBooks.contains(book) && book.isAvailable == false){
            book.isAvailable = true;
            return true;
        }

        return false;
    }

}
