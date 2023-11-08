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
                "Wydawnictwo Dolnoslaskie",
                "14.05.2013",
                LiteratureGenre.CRIME,
                14.99f,
                "Agatha Christie",
                "9788327153999"));
        booksForLibrary.add(new Book(
                "Historia pracy. Nowe dzieje ludzkosci",
                "Horyzont Znak",
                "2023",
                LiteratureGenre.HISTORY,
                88.39f,
                "Jan Lucassen",
                "9788324088713"));
        
        magazinesForLibrary.add(new Magazine(
                "PC Format",
                "Fantasyexpo",
                "01.03.2021",
                LiteratureGenre.TECHNOLOGY,
                9.5f,
                247));
        magazinesForLibrary.add(new Magazine(
                "CD-Action",
                "Fantasyexpo",
                "01.04.2022",
                LiteratureGenre.OTHER,
                34.5f,
                312));
        
        //-------------------
        
        Client firstClient = new Client("Andrew", "Bookeater", 2, LiteratureGenre.CRIME);
        Library onlyLibrary = new Library(employeesForLibrary, booksForLibrary, magazinesForLibrary);
        
        List<Book> booksForHim = onlyLibrary.searchForBooksByGenre(firstClient.getFavouriteGenre());
        System.out.println("\n===================\n");
        if (!booksForHim.isEmpty()) {
            System.out.println("---- BOOK FOUND ----");
            booksForHim.get(0).describeItself();
            onlyLibrary.startLeaseOfBook("10.11.2023", booksForHim.get(0), firstClient, 16);
            onlyLibrary.printListOfLeases();
        } else {
            System.out.println("We don't have books you're looking for.");
        }
    }
}
