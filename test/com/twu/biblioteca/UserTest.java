package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tanyabutenko on 10/03/15.
 */
public class UserTest {

    @Test
    public void TestGetUserProfile(){
        User user = new User();
        user.userProfile("Tanya", "t@gmail.com", "0450111000");

        assertEquals("Name: Tanya, email: t@gmail.com, phone: 0450111000", user.getUserProfile());
    }

    @Test
    public void TestCheckUserLogin(){
        User user = new User();
        user.setUserLogin("000-1111", "chicken1");

        assertTrue(user.checkUserLogin("000-1111", "chicken1"));
        assertFalse(user.checkUserLogin("000-1111", "chicken23"));
    }
}
