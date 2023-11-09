package com.solvd.library;

abstract public class LiteraryPiece implements IPurchasable {
    protected String title;
    public String publisher;
    public String publishDate;
    protected LiteratureGenre genre;
    protected float price;
    
    public LiteraryPiece() {
        title = " ";
        publisher = " ";
        publishDate = "31-12-1900";
        genre = LiteratureGenre.OTHER;
        price = 0f;
    }
    
    public LiteraryPiece(String newTitle, String newPublish, String whenPublished, LiteratureGenre whatGenre, float newPrice) {
        title = newTitle;
        publisher = newPublish;
        publishDate = whenPublished;
        genre = whatGenre;
        price = newPrice;
    }
    
    public void setTitle(String newTitle) {
        try (ClassCheckingForStringContent cc = new ClassCheckingForStringContent(newTitle)) {
            cc.checkIfBlank();
            title = newTitle;
        } catch(RuntimeException e) {
            System.out.println("Exception while changing title: "+ e.getMessage());
        }
    }
    
    public String getTitle() {
        return title;
    }
    
    public final void setGenre(LiteratureGenre newGenre) {
        genre = newGenre;
    }
    
    public final LiteratureGenre getGenre() {
        return genre;
    }
    
    public void setPrice(float newPrice) throws ArithmeticException {
        if (newPrice >= 0f) {
            price = newPrice;
        } else {
            throw new ArithmeticException("Price can't be negative");
        }
    }
    
    public float getPrice() {
        return price;
    }
    
    abstract public void describeItself();
}
