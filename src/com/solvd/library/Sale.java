package com.solvd.library;

public class Sale extends GivingLiterature {
    private float cost;
    
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
    
    public void setCost(float newCost) {
        if (newCost > 0) {
            cost = newCost;
        }
        return;
    }
    
    public void describeThisSale() {
        String writtenText = ""; //empty string
        writtenText += "On " + dateWhen + " \"" + pieceOfLiterature.title + "\" has been sold to ";
        writtenText += "client " + Integer.toString(getClientNumber());
        writtenText += " for " + Float.toString(cost) + " PLN.";
        System.out.print(writtenText);
        return;
    }
}
