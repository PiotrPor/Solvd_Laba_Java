package com.solvd.library;

public class Magazine extends LiteraryPiece {
    public int issueNumber;
    
    public Magazine() {
        super();
        issueNumber = 1;
    }
    
    public Magazine(String newTitle, String newPublish, String whenPublished, LiteratureGenre whatGenre, float newPrice, int whatNumber) {
        super(newTitle, newPublish, whenPublished, whatGenre, newPrice);
        issueNumber = whatNumber;
    }
    
    public void describeItself() {
        System.out.println("Magazine titled \"" + title + "\"");
        System.out.println("Genre: " + genre.toString());
        System.out.println("Issue number: " + Integer.toString(issueNumber) + " dated on " + publishDate);
        System.out.println("Published by " + publisher);
        System.out.println("Price: " + Float.toString(getPrice()) + " PLN");
        return;
    }
}
