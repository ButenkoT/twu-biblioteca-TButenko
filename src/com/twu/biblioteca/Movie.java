package com.twu.biblioteca;

/**
 * Created by tanyabutenko on 5/03/15.
 */
public class Movie extends LibItem{
    private String Rating;

    public String getRating(){
        return Rating;
    }

    public void setRating( String newRating){
        Rating = newRating;
    }
}
