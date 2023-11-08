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
        if (!(newTitle.isEmpty() || newTitle.equals(" "))) {
            title = newTitle;
        } else {
            System.out.println("Title can't be an empty string.");
        }
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setGenre(LiteratureGenre newGenre) {
        genre = newGenre;
    }
    
    public LiteratureGenre getGenre() {
        return genre;
    }
    
    public void setPrice(float newPrice) {
        if (newPrice >= 0f) {
            price = newPrice;
        } else {
            System.out.println("Price can't be lower than 0.");
        }
    }
    
    public float getPrice() {
        return price;
    }
    
    abstract public void describeItself();
}
