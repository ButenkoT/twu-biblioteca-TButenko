package com.twu.biblioteca;

/**
 * Created by tanyabutenko on 10/03/15.
 */
public class User {
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

    public void userProfile(String newUserName, String newUserEmail, String newUserPhone){
        UserName = newUserName;
        UserEmail = newUserEmail;
        UserPhone = newUserPhone;
    }

    public void setUserLogin(String newUserLibraryNumber, String newUserPassword){
        UserLibraryNumber = newUserLibraryNumber;
        UserPassword = newUserPassword;
    }

    public Boolean checkUserLogin(String inputUserLibNumber, String inputUserPassword){
        return (inputUserLibNumber.equals(getUserLogin()[0])  && inputUserPassword.equals(getUserLogin()[1]));
    }

}
