package com.solvd.library;

public class Person {
    protected String name;
    protected String surname;
    
    public Person() {
        name = "John";
        surname = "Doe";
    }
    
    public Person(String fn, String sur) {
        name = fn;
        surname = sur;
    }
    
    public void setPersonName(String newName) {
        if (newName.length() >= 2) {
            name = newName;
        }
        return;
    }
    
    public String getPersonName() {
        return name;
    }
    
    public void setPersonSurname(String newName) {
        if (newName.length() >= 2) {
            surname = newName;
        }
        return;
    }
    
    public String getPersonSurname() {
        return surname;
    }
    
    //overriding methods from "Object" base class
    
    @Override
    public String toString() {
        return (name + " " + surname);
    }
    
    @Override
    public int hashCode() {
        int nameFirstLetterAscii = Character.getNumericValue(name.charAt(0));
        int surnameFirstLetterAscii = Character.getNumericValue(surname.charAt(0));
        return nameFirstLetterAscii + surnameFirstLetterAscii;
    }
    
    @Override
    public boolean equals(Object second) {
        //if compared object is this object
        if (second == this) {
            return true;
        }
        
        //if compared object isn't of "Person" class
        if (!(second instanceof Person)) {
            return false;
        }
        
        Person p2 = (Person) second;
        
        if (this.name.equals(p2.name) && this.surname.equals(p2.surname)) {
            return true;
        } else {
            return false;
        }
    }
}
