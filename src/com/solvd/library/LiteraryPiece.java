package com.solvd.library;

public class LiteraryPiece {
    public String title;
    public String publisher;
    public String publishDate;
    public LiteratureGenre genre;
    private float price;
    
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
    
    public void setPrice(float newPrice) {
        if (newPrice > 0f) {
            price = newPrice;
        }
        return;
    }
    
    public float getPrice() {
        return price;
    }
}
