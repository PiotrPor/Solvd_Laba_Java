package com.solvd.library;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
Among the files in this package
  "MainClass.java" contains the main()
  "LiteratureGenre.java" is an enumerator
  11 files are classes
  5 files are interfaces
*/

public class MainClass {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    
    static {
        System.setProperty("log4j.configurationFile", "log4j.xml");
    }

    public static void main(String[] args) {
        LOGGER.info("main() starts running");
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
        LOGGER.info("\n===================\n");
        if (!booksForHim.isEmpty()) {
            try {
                booksForHim.get(0).describeItself();
                onlyLibrary.startLeaseOfBook("10.11.2023", booksForHim.get(0), firstClient, 16);
            } catch(ArrayIndexOutOfBoundsException e) {
                LOGGER.warn("Tried to access invalid index in array of books");
            }
            LOGGER.info("---- BOOK FOUND ----");
            onlyLibrary.printListOfLeases();
        } else {
            LOGGER.info("We don't have books you're looking for.");
        }
    }
}
