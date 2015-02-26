package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Hello, welcome to our library!");
        System.out.println("Please, choose an action you would like to take: list of books, checkout book, return book or leave library: ");

        Library library = new Library();

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

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.listBooks();

        if(library.checkoutBook(book1)){
            System.out.println("You successfully checked-out " + book1.bookName);
        } else {
            System.out.println("Sorry, but there is no such book in the library, try to check on your spelling.");
        }

        library.listBooks();

        if(library.returnBook(book1)){
            System.out.println("You successfully returned " + book1.bookName);
        } else {
            System.out.println("Sorry, but the library doesn't have this book, try to check on your spelling.");
        }

        library.listBooks();

    }
}
