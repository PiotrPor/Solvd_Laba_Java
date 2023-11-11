package com.solvd.library.exceptions;

  //TODO: change which exception to extend ?
public class NegativeCostException extends Exception {
    public NegativeCostException() {
        super();
    }
    
    public NegativeCostException(String msg) {
        super(msg);
    }
}
