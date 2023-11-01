package com.solvd.library;

public class GivingLiterature {
    public String dateWhen;
    public LiteraryPiece pieceOfLiterature;
    private int clientNumber;
    
    public GivingLiterature() {
        dateWhen = "06.11.2023";
        pieceOfLiterature = new Book();
        clientNumber = 0;
    }
    
    public GivingLiterature(String when, LiteraryPiece lp, int cn) {
        dateWhen = when;
        pieceOfLiterature = lp;
        clientNumber = cn;
    }
    
    public void setClientNumber(int newClientNumber) {
        clientNumber = newClientNumber;
        return;
    }
    
    public int getClientNumber() {
        return clientNumber;
    }
}
