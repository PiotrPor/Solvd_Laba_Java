package com.solvd.library;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sale extends GivingLiterature implements IForTransaction {
    private float cost;
    private static final Logger LOGGER = LogManager.getLogger(Sale.class);
    
    public Sale() {
        super();
        cost = 1.00f;
    }
    
    public Sale(String when, LiteraryPiece lp, int cn) {
        super(when, lp, cn);
        cost = lp.getPrice();
    }
    
    public float getCost() {
        return cost;
    }
    
    public void setCost(float newCost) throws ArithmeticException {
        if (newCost >= 0) {
            cost = newCost;
        } else {
            throw new ArithmeticException("Cost can't be negative");
        }
    }
    
    public void describeTransaction() {
        LOGGER.info(this.toString());
    }
    
    @Override
    public String toString() {
        String writtenText = ""; //empty string
        writtenText += "On " + dateWhen + " \"" + pieceOfLiterature.title + "\" has been sold to ";
        writtenText += "client " + Integer.toString(clientNumber);
        writtenText += " for " + Float.toString(cost) + " PLN.";
        return writtenText;
    }
}
