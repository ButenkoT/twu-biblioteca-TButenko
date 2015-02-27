package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {

        Library library = new Library();

        library.setUpLibrary();

        InputReader inputReader = new InputReader();
        String userInput = inputReader.getUserInput("Please, choose an action you would like to take: list, checkout, return or quite: ");
        Book userBookInput = new Book();

        if (userInput.equals("list")) {
            library.listBooks();
        } else if (userInput.equals("checkout")) {

            String userBookName = inputReader.getUserInput("Please, enter name of the book: ");

            if (library.checkoutBook(library.findBook(userBookName))) {
                System.out.println("Thank you, enjoy the book " + userBookName);
            } else {
                System.out.println("Sorry, the book is not available, select a different book or correct the spelling.");
            }
        } else if (userInput.equals("return")) {
            String userBookName = inputReader.getUserInput("Please, enter name of the book: ");

            if (library.returnBook(library.findBook(userBookName))) {
                System.out.println("Thank you for returning the book " + userBookName);
            } else {
                System.out.println("Sorry, that is not a valid book to return, try to check on your spelling.");
            }
        } else if(userInput.equals("quite")){

            System.out.println("Thank you for visiting our library. Good bye!");

        }else {
            System.out.println("Please, choose valid option.");
        }

    }
}
