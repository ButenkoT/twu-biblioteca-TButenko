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

                ArrayList<LibItem> availableList;
                availableList = library.listBooks();

                for(LibItem oneLibItem : availableList){
                    System.out.println("'" + oneLibItem.getTitle() + "' by " + oneLibItem.getAuthor() + ", " + oneLibItem.getYear());
                }

            } else if (userInput.equals("checkout")) {

                String userTitle = inputReader.getUserInput("Please, enter title: ");

                if (library.checkoutBook(library.findBook(userTitle))) {
                    System.out.println("Thank you, enjoy '" + userTitle + "'");
                } else {
                    System.out.println("Sorry, the item is not available, select a different item or correct the spelling.");
                }
            } else if (userInput.equals("return")) {
                String userTitle = inputReader.getUserInput("Please, enter title: ");

                if (library.returnBook(library.findBook(userTitle))) {
                    System.out.println("Thank you for returning '" + userTitle + "'");
                } else {
                    System.out.println("Sorry, that is not a valid item to return, try to check on your spelling.");
                }
            } else if (userInput.equals("quit")) {

                System.out.println("Thank you for visiting our library. Good bye!");

            } else {
                System.out.println("Please, choose valid option.");
            }
        }
    }
}
