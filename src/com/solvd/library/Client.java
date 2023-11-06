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
    
    // Override Object methods
    
    @Override
    public String toString() {
        return (name + " " + surname + " - client no. " + clientNumber);
    }
    
    @Override
    public int hashCode() {
        int nameFirstLetterAscii = Character.getNumericValue(name.charAt(0));
        int surnameFirstLetterAscii = Character.getNumericValue(surname.charAt(0));
        return nameFirstLetterAscii + surnameFirstLetterAscii + clientNumber;
    }
    
    @Override
    public boolean equals(Object second) {
        //if compared object is this object
        if (second == this) {
            return true;
        }
        
        //if compared object isn't of "Client" class
        if (!(second instanceof Client)) {
            return false;
        }
        
        Client p2 = (Client) second;
        
        if (this.name.equals(p2.name) &&
                this.surname.equals(p2.surname) &&
                this.clientNumber == p2.clientNumber) {
            return true;
        } else {
            return false;
        }
    }
}
