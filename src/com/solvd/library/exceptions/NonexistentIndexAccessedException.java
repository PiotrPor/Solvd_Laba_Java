package com.solvd.library.exceptions;

  //TODO: change which exception to extend ?
public class NonexistentIndexAccessedException extends Exception {
    public NonexistentIndexAccessedException() {
        super();
    }
    
    public NonexistentIndexAccessedException(String msg) {
        super(msg);
    }
}
