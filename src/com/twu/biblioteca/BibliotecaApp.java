package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {


    public static void main(String[] args) {

        Library library = new Library();

        library.setUpLibrary();

        System.out.println("Hello, welcome to our library!");

        InputReader inputReader = new InputReader();

        String userInput = "";

        while (!userInput.equals("quit")) {

            userInput = inputReader.getUserInput("Please, choose an action you would like to take: list, checkout, return or quit: ");


            if (userInput.equals("list")) {

                ArrayList<Book> availableList;
                availableList = library.listBooks();

                for(Book oneBook : availableList){
                    System.out.println("'" + oneBook.getBookTitle() + "' by " + oneBook.getBookAuthor() + ", " + oneBook.getBookYear());
                }

            } else if (userInput.equals("checkout")) {

                String userBookTitle = inputReader.getUserInput("Please, enter name of the book: ");

                if (library.checkoutBook(library.findBook(userBookTitle))) {
                    System.out.println("Thank you, enjoy the book " + "'" + userBookTitle + "'");
                } else {
                    System.out.println("Sorry, the book is not available, select a different book or correct the spelling.");
                }
            } else if (userInput.equals("return")) {
                String userBookTitle = inputReader.getUserInput("Please, enter name of the book: ");

                if (library.returnBook(library.findBook(userBookTitle))) {
                    System.out.println("Thank you for returning the book " + "'" + userBookTitle + "'");
                } else {
                    System.out.println("Sorry, that is not a valid book to return, try to check on your spelling.");
                }
            } else if (userInput.equals("quit")) {

                System.out.println("Thank you for visiting our library. Good bye!");

            } else {
                System.out.println("Please, choose valid option.");
            }
        }
    }
}
