package com.solvd.library;

public class Magazine extends LiteraryPiece {
    private int issueNumber;
    
    public Magazine() {
        super();
        issueNumber = 1;
    }
    
    public Magazine(String newTitle, String newPublish, String whenPublished, LiteratureGenre whatGenre, float newPrice, int whatNumber) {
        super(newTitle, newPublish, whenPublished, whatGenre, newPrice);
        issueNumber = whatNumber;
    }
    
    public void setIssueNumber(int newNumber) {
        if (newNumber >= 0) {
            issueNumber = newNumber;
        } else {
            System.out.println("Issue number can't be lower than 0.");
        }
    }
    
    public int getIssueNumber() {
        return issueNumber;
    }
    
    public void describeItself() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        String writtenText = "Magazine titled \"" + title + "\"\n";
        writtenText += "Genre: " + genre.toString() + "\n";
        writtenText += "Issue number: " + Integer.toString(issueNumber) + " dated on " + publishDate + "\n";
        writtenText += "Published by " + publisher + "\n";
        writtenText += "Price: " + Float.toString(price) + " PLN\n";
        return writtenText;
    }
}
