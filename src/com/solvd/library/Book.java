package com.solvd.library;

public class Book extends LiteraryPiece {
    private String author;
    private String isbn; //without letters "ISBN" at the beginning, only digits
    
    public Book() {
        super();
        author = " ";
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
    
    public void setAuthor(String newAuthor) {
        if (!(newAuthor.isEmpty() || newAuthor.equals(" "))) {
            author = newAuthor;
        } else {
            System.out.println("Author can't be an empty string.");
        }
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setISBN(String newISBN) {
        if (newISBN.length() == 10 || newISBN.length() == 13) {
            isbn = newISBN;
        } else {
            System.out.println("ISBN code must have either 10 or 13 digits");
        }
    }
    
    public String getISBN() {
        return isbn;
    }
    
    public void describeItself() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        String thisAsString = "Book titled \"" + title + "\"\n";
        thisAsString += "Genre: " + genre.toString() + "\n";
        thisAsString += "Written by " + author + "\n";
        thisAsString += "Published by " + publisher + " on " + publishDate + "\n";
        thisAsString += "ISBN " + isbn + "\n";
        thisAsString += "Price: " + Float.toString(price) + " PLN\n";
        return thisAsString;
    }
}
