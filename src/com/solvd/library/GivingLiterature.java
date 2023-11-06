package com.solvd.library;

public class GivingLiterature {
    public String dateWhen;
    protected LiteraryPiece pieceOfLiterature;
    protected int clientNumber;
    
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
    
    public void setPieceOfLiterature(LiteraryPiece newLP) {
        pieceOfLiterature = newLP;
        return;
    }
    
    public LiteraryPiece getPieceOfLiterature() {
        return pieceOfLiterature;
    }
    
    public void setClientNumber(int newClientNumber) {
        clientNumber = newClientNumber;
        return;
    }
    
    public int getClientNumber() {
        return clientNumber;
    }
}
