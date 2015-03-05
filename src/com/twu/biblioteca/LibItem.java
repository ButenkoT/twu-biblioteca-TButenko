package com.twu.biblioteca;

/**
 * Created by tanyabutenko on 5/03/15.
 */
public class LibItem {

    private String Title;
    private String Author;
    private String Year;
    boolean isAvailable = true;

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return Author;
    }

    public String getYear(){
        return Year;
    }

    public void setTitle( String newTitle){
        Title = newTitle;
    }

    public void setAuthor( String newAuthor){
        Author = newAuthor;
    }

    public void setYear( String newYear){
        Year = newYear;
    }

}
