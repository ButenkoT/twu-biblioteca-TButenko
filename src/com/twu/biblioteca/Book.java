package com.twu.biblioteca;
import java.util.*;

/**
 * Created by tetianabutenko on 26/02/2015.
 */
public class Book {

    String bookAuthor;
    String bookYear;
    ArrayList<String> listOfBooks;
    ArrayList<String> listOfAvailableBooks;

    public ArrayList<String> listBooks(ArrayList<String> list){

        for(String oneBook : list){
            System.out.println(oneBook);
        }
        return list;
    }

    public boolean checkoutBook(String book){

        if(listOfAvailableBooks.contains(book)){
            listOfAvailableBooks.remove(book);
            System.out.println("You successfully checked-out " + book);
        } else {
            System.out.println("Sorry, but there is no such book in the library, try to check on your spelling.");
        }

        return listOfAvailableBooks.contains(book);
    }
    
}
