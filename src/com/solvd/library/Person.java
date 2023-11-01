package com.solvd.library;

public class Person {
    public String name;
    public String surname;
    
    public Person() {
        name = "John";
        surname = "Doe";
    }
    
    public Person(String fn, String sur) {
        name = fn;
        surname = sur;
    }
}
