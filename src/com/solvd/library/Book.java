package com.solvd.library;

public class Book extends LiteraryPiece {
    public String author;
    private String isbn; //without letters "ISBN" at the beginning, only digits
    
    public Book() {
        super();
        author = "Nobody";
        isbn = "0000000000000";
    }
    
    public Book(String newTitle, String newPublish, String whenPublished, LiteratureGenre whatGenre, float newPrice, String itsAuthor, String isbnNumber) {
        super(newTitle, newPublish, whenPublished, whatGenre, newPrice);
        author = itsAuthor;
        if (isbnNumber.length() == 10 || isbnNumber.length() == 13) {
            isbn = isbnNumber;
        } else {
            isbn = "000000000000";
        }
    }
    
    public void setISBN(String newISBN) {
        if (newISBN.length() == 10 || newISBN.length() == 13) {
            isbn = newISBN;
        }
        return;
    }
    
    public String getISBN() {
        return isbn;
    }
    
    public void describeItself() {
        System.out.println("Book titled \"" + title + "\"");
        System.out.println("Genre: " + genre.toString());
        System.out.println("Written by " + author);
        System.out.println("Published by " + publisher + " on " + publishDate);
        System.out.println("ISBN " + isbn);
        System.out.println("Price: " + Float.toString(getPrice()) + " PLN");
        return;
    }
}
