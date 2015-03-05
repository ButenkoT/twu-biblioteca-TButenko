package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by tetianabutenko on 26/02/2015.
 */
public class Library {

    private ArrayList<LibItem> listOfAvailableBooks;

    public ArrayList<LibItem> getListOfAvailableBooks(){
        return listOfAvailableBooks;
    }

    public void setListOfAvailableBooks(ArrayList<LibItem> newList){
        this.listOfAvailableBooks = newList;
    }

    public Library() {
        this.listOfAvailableBooks = new ArrayList<LibItem>();
    }

    public void setUpLibrary() {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.setTitle("To Kill the Mockingbird");
        book1.setAuthor("Harper Lee");
        book1.setYear("1960");

        book2.setTitle("Emma");
        book2.setAuthor("Jane Austen");
        book2.setYear("1815");

        book3.setTitle("Dracula");
        book3.setAuthor("Bram Stoker");
        book3.setYear("1897");

        Movie movie1 = new Movie();
        Movie movie2 = new Movie();

        movie1.setTitle("The Godfather");
        movie1.setAuthor("F.F.Coppola");
        movie1.setYear("1972");
        movie1.setRating("9");

        movie2.setTitle("Pulp Fiction");
        movie2.setAuthor("Q.Tarantino");
        movie2.setYear("1994");
        movie2.setRating("10");

        this.setListOfAvailableBooks(new ArrayList<LibItem>());

        this.getListOfAvailableBooks().add(book1);
        this.getListOfAvailableBooks().add(book2);
        this.getListOfAvailableBooks().add(book3);

        this.getListOfAvailableBooks().add(movie1);
        this.getListOfAvailableBooks().add(movie2);

    }

    public void addBook(Book book) {
        this.getListOfAvailableBooks().add(book);
    }

    public ArrayList<LibItem> listBooks() {

        ArrayList<LibItem> availableItems = new ArrayList<LibItem>();
        for (LibItem oneLibItem : this.getListOfAvailableBooks()) {

            if (oneLibItem.isAvailable) {
               availableItems.add(oneLibItem);
            }
        }
        return availableItems;
    }

    public LibItem findBook(String userItemName) {
        for (LibItem oneLibItem : this.getListOfAvailableBooks()) {
            if (oneLibItem.getTitle().equals(userItemName)) {
                return oneLibItem;
            }
        }
        return null;
    }

    public boolean checkoutBook(LibItem item) {
        if (this.getListOfAvailableBooks().contains(item) && item.isAvailable) {
            item.isAvailable = false;
            return true;
        }

        return false;
    }

    public boolean returnBook(LibItem item) {
        if (this.getListOfAvailableBooks().contains(item) && !item.isAvailable) {
            item.isAvailable = true;
            return true;
        }

        return false;
    }

}
