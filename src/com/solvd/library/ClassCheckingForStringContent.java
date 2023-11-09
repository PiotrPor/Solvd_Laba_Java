package com.solvd.library;

import java.io.*;

public class ClassCheckingForStringContent implements AutoCloseable {
    public String investigatedString;

    public ClassCheckingForStringContent() {
        investigatedString = "";
    }
    
    public ClassCheckingForStringContent(String s) {
        investigatedString = s;
    }
    
    public void checkIfBlank() throws RuntimeException {
        if (investigatedString.isEmpty() || investigatedString.equals(" ")) {
            throw new RuntimeException("The string to be set is blank or empty");
        } else {
            // do nothing
        }
    }
    
    @Override
    public void close() {
        System.out.println("Object used for checking a string is closing");
    }
}
