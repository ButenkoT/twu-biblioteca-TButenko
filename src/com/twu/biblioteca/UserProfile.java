package com.twu.biblioteca;

/**
 * Created by tanyabutenko on 10/03/15.
 */
public class UserProfile {
    private String UserName;
    private String UserEmail;
    private String UserPhone;
    private String UserPassword;
    private String UserLibraryNumber;

    public String getUserProfile(){
        return "Name: " + UserName + ", email: " + UserEmail + ", phone: " + UserPhone;
    }

    public String[] getUserLogin(){
        String[] UserLogin = new String[2];
        UserLogin[0] = UserLibraryNumber;
        UserLogin[1] = UserPassword;
       return UserLogin;
    }

    public void UserProfile(String newUserName, String newUserEmail, String newUserPhone){
        UserName = newUserName;
        UserEmail = newUserEmail;
        UserPhone = newUserPhone;
    }

    public void setUserLogin(String newUserLibraryNumber, String newUserPassword){
        UserLibraryNumber = newUserLibraryNumber;
        UserPassword = newUserPassword;
    }

}
