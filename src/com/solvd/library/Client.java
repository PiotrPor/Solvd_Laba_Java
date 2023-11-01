package com.solvd.library;

public class Client extends Person {
    public int clientNumber;
    
    public Client() {
        super();
        clientNumber = 0;
    }
    
    public Client(String theirName, String theirSurname, int theirNumber) {
        super(theirName, theirSurname);
        clientNumber = theirNumber;
    }
}
