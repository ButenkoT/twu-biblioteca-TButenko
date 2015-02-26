package com.twu.biblioteca;

import java.io.*;

/**
 * Created by tetianabutenko on 27/02/2015.
 */
public class InputReader {

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");

        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }
}
