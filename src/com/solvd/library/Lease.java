package com.solvd.library;

public class Lease extends GivingLiterature {
    private int durationInDays;
    
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
    
    public void describeThisLease() {
        System.out.println(this.toString());
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
