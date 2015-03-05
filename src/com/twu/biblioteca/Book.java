package com.twu.biblioteca;
/**
 * Created by tetianabutenko on 26/02/2015.
 */
public class Book {

    private String bookTitle;
    private String bookAuthor;
    private String bookYear;
    boolean isAvailable = true;

    public String getBookTitle(){
        return bookTitle;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    public String getBookYear(){
        return bookYear;
    }

    public void setBookTitle( String newBookTitle){
        bookTitle = newBookTitle;
    }

    public void setBookAuthor( String newBookAuthor){
        bookAuthor = newBookAuthor;
    }

    public void setBookYear( String newBookYear){
        bookYear = newBookYear;
    }

}
