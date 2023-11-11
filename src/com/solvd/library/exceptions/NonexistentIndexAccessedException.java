package com.solvd.library.exceptions;

public class NonexistentIndexAccessedException extends RuntimeException {
    public NonexistentIndexAccessedException() {
        super();
    }
    
    public NonexistentIndexAccessedException(String msg) {
        super(msg);
    }
}
