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
