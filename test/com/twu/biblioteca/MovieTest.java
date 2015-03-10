package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tanyabutenko on 10/03/15.
 */
public class MovieTest {

    @Test
    public void TestGetRating(){
        Movie movie = new Movie();
        movie.setRating("8");

        assertEquals("8", movie.getRating());
    }
}
