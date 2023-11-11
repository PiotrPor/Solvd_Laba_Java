package com.solvd.library.exceptions;

  //TODO: change which exception to extend ?
public class RemovingAuthorException extends Exception {
    public RemovingAuthorException() {
        super();
    }
    
    public RemovingAuthorException(String msg) {
        super(msg);
    }
}
