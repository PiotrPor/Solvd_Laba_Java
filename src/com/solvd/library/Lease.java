package com.solvd.library;

public class Lease extends GivingLiterature {
    public int durationDays;
    
    public Lease() {
        super();
        durationDays = 14;
    }
    
    public Lease(String when, LiteraryPiece lp, int cn, int dur) {
        super(when, lp, cn);
        durationDays = dur;
    }
    
    public void describeThisLease() {
        String writtenText = ""; //empty string
        writtenText += "On " + dateWhen + " \"" + pieceOfLiterature.title + "\" has been leased to ";
        writtenText += "client " + Integer.toString(getClientNumber());
        writtenText += " for " + Integer.toString(durationDays) + " days.";
        System.out.print(writtenText);
        return;
    }
}
