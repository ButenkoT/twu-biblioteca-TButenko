package com.twu.biblioteca;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by tetianabutenko on 26/02/2015.
 */
public class Library {

    private ArrayList<LibItem> listOfAvailableItems;

    public ArrayList<LibItem> getListOfAvailableItems(){
        return listOfAvailableItems;
    }

    public void setListOfAvailableItems(ArrayList<LibItem> newList){
        this.listOfAvailableItems = newList;
    }

    public Library() {
        this.listOfAvailableItems = new ArrayList<LibItem>();
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

        this.setListOfAvailableItems(new ArrayList<LibItem>());

        this.getListOfAvailableItems().add(book1);
        this.getListOfAvailableItems().add(book2);
        this.getListOfAvailableItems().add(book3);

        this.getListOfAvailableItems().add(movie1);
        this.getListOfAvailableItems().add(movie2);

    }

    public void addItem(LibItem item) {
        this.getListOfAvailableItems().add(item);
    }

    public ArrayList<LibItem> listItems() {

        ArrayList<LibItem> availableItems = new ArrayList<LibItem>();
        for (LibItem oneLibItem : this.getListOfAvailableItems()) {

            if (oneLibItem.isAvailable) {
               availableItems.add(oneLibItem);
            }
        }
        return availableItems;
    }

    public LibItem findItem(String userItemName) {
        for (LibItem oneLibItem : this.getListOfAvailableItems()) {
            if (oneLibItem.getTitle().equals(userItemName)) {
                return oneLibItem;
            }
        }
        return null;
    }

    public boolean checkoutItem(LibItem item) {
        if (this.getListOfAvailableItems().contains(item) && item.isAvailable) {
            item.isAvailable = false;
            return true;
        }

        return false;
    }

    public boolean returnItem(LibItem item) {
        if (this.getListOfAvailableItems().contains(item) && !item.isAvailable) {
            item.isAvailable = true;
            return true;
        }

        return false;
    }

}
