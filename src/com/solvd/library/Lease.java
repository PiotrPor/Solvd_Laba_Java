package com.solvd.library;

import com.solvd.library.interfaces.IForTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Lease extends GivingLiterature implements IForTransaction {
    private int durationInDays;
    private static final Logger LOGGER = LogManager.getLogger(Lease.class);
    
    public Lease() {
        super();
        durationInDays = 14;
    }
    
    public Lease(String when, LiteraryPiece lp, int cn, int dur) {
        super(when, lp, cn);
        durationInDays = dur;
    }
    
    public int getDurationInDays() {
        return durationInDays;
    }
    
    public void describeTransaction() {
        LOGGER.info(this.toString());
    }
    
    @Override
    public String toString() {
        String writtenText = ""; //empty string
        writtenText += "On " + dateWhen + " \"" + pieceOfLiterature.title + "\" has been leased to ";
        writtenText += "client " + Integer.toString(clientNumber);
        writtenText += " for " + Integer.toString(durationInDays) + " days.";
        return writtenText;
    }
}
