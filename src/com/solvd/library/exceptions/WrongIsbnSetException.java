package com.solvd.library.exceptions;

  //TODO: change which exception to extend ?
public class WrongIsbnSetException extends Exception {
    public WrongIsbnSetException() {
        super();
    }
    
    public WrongIsbnSetException(String msg) {
        super(msg);
    }
}
