package com.solvd.library;

import java.util.ArrayList;
import java.util.List;

/*
Among the files in this package
  "MainClass.java" contains the main()
  "LiteratureGenre.java" is an enumerator
  remaining 10 files are classes
*/

public class MainClass {
    public static void main(String[] args) {
        List<Employee> employeesForLibrary = new ArrayList<>();
        List<Book> booksForLibrary = new ArrayList<>();
        List<Magazine> magazinesForLibrary = new ArrayList<>();
        
        //----------
        
        employeesForLibrary.add(new Employee("Jane", "Bookqueen", 1, 4000f));
        employeesForLibrary.add(new Employee("Margarett", "Paperlady", 2, 3900f));
        
        booksForLibrary.add(new Book(
                "The ABC murders",
                "Wydawnictwo Dolnoslaskie", //Polish language
                "14.05.2013",
                LiteratureGenre.CRIME,
                14.99f,
                "Agatha Christie",
                "9788327153999"));
        booksForLibrary.add(new Book(
                "Historia pracy. Nowe dzieje ludzkosci", //Polish language
                "Horyzont Znak",
                "2023",
                LiteratureGenre.HISTORY,
                88.39f,
                "Jan Lucassen",
                "9788324088713"));
        
        //array with magazines is left empty for  now
        
        //-------------------
        
        Client firstClient = new Client("Andrew", "Bookeater", 2);
        Library onlyLibrary = new Library(employeesForLibrary, booksForLibrary, magazinesForLibrary);
        
        onlyLibrary.searchForBook("The ABC murders");
        System.out.println("\n===================\n");
        onlyLibrary.startLeaseOfBook("3.11.2023", booksForLibrary.get(0), firstClient, 16);
        onlyLibrary.printListOfLeases();
        
        return;
    }
}
