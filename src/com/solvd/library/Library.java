package com.solvd.library;

import com.solvd.library.interfaces.IStorageOfBooks;
import com.solvd.library.interfaces.IForManagingBusiness;
import com.solvd.library.exceptions.NonexistentIndexAccessedException;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Library implements IStorageOfBooks, IForManagingBusiness {
    public List<Employee> listOfEmployees;
    public List<Book> ourBooks;
    public List<Magazine> ourMagazines;
    public List<Lease> currentLeases;
    public List<Sale> listOfSales;
    private float income;
    private static final Logger LOGGER = LogManager.getLogger(Library.class);
    
    static {
        LOGGER.info(" ! We're ready to open our library ! ");
    }
    
    public Library() {
        listOfEmployees = new ArrayList<>();
        ourBooks = new ArrayList<>();
        ourMagazines = new ArrayList<>();
        currentLeases = new ArrayList<>();
        listOfSales = new ArrayList<>();
        income = 0f;
    }
    
    public Library(List<Employee> emps, List<Book> books, List<Magazine> mags) {
        listOfEmployees = emps;
        ourBooks = books;
        ourMagazines = mags;
        currentLeases = new ArrayList<>();
        listOfSales = new ArrayList<>();
        income = 0f;
    }
    
    public void addToIncome(float toBeAdded) {
        income += toBeAdded;
    }
    
    public float getIncome() {
        return income;
    }
    
    public List<Book> searchForBooksByTitle(String searchedTitle) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < ourBooks.size(); i++) {
            if (ourBooks.get(i).title.equals(searchedTitle)) {
                foundBooks.add(ourBooks.get(i));
            }
        }
        return foundBooks;
    }
    
    public List<Book> searchForBooksByGenre(LiteratureGenre searchedGenre) {
        List<Book> foundBooks = new ArrayList<>();
        for (int i = 0; i < ourBooks.size(); i++) {
            if (ourBooks.get(i).getGenre() == searchedGenre) {
                foundBooks.add(ourBooks.get(i));
            }
        }
        return foundBooks;
    }
    
    public void startLeaseOfBook(String startingDate, Book b, Client thisClient, int lengthInDays) {
        currentLeases.add(new Lease(startingDate, b, thisClient.getClientNumber(), lengthInDays));
    }
    
    public void sellBook(String dateOfSale, Book b, Client thisClient) {
        listOfSales.add(new Sale(dateOfSale, b, thisClient.getClientNumber()));
    }
    
    public void startLeaseOfBook(String startingDate, int index, Client thisClient, int lengthInDays) throws NonexistentIndexAccessedException {
        if (index >= 0 && index < ourBooks.size()) {
            Book leasedBook = ourBooks.get(index);
            this.startLeaseOfBook(startingDate, leasedBook, thisClient, lengthInDays);
        } else {
            throw new NonexistentIndexAccessedException("Tried to acccess an index which isn't in the array/collection");
        }
    }
    
    //for now there's no method to lease a magazine
    
    public void sellMagazine(String dateOfSale, Magazine m, Client thisClient) {
        listOfSales.add(new Sale(dateOfSale, m, thisClient.getClientNumber()));
    }
    
    public void printListOfLeases() {
        if (!currentLeases.isEmpty()) {
            LOGGER.info("Leases we've done:");
            for (int i = 0; i < currentLeases.size(); i++) {
                LOGGER.info(Integer.toString(i + 1) + ") ");
                currentLeases.get(i).describeTransaction();
                LOGGER.info("\n");
            }
        } else {
            LOGGER.info("The are no leases");
        }
    }
    
    public void printListOfSales() {
        if (!listOfSales.isEmpty()) {
            LOGGER.info("Sales we've done:");
            for (int i = 0; i < listOfSales.size(); i++) {
                LOGGER.info(Integer.toString(i + 1) + ") ");
                listOfSales.get(i).describeTransaction();
                LOGGER.info("\n");
            }
        } else {
            LOGGER.info("Nothing has been sold");
        }
    }
}
