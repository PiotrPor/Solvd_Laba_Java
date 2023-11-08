package com.solvd.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Employee> listOfEmployees;
    public List<Book> ourBooks;
    public List<Magazine> ourMagazines;
    public List<Lease> currentLeases;
    public List<Sale> listOfSales;
    private float income;
    
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
        currentLeases.add(new Lease(startingDate, b, thisClient.clientNumber, lengthInDays));
    }
    
    public void sellBook(String dateOfSale, Book b, Client thisClient) {
        listOfSales.add(new Sale(dateOfSale, b, thisClient.clientNumber));
    }
    
    //for now there's no method to lease a magazine
    
    public void sellMagazine(String dateOfSale, Magazine m, Client thisClient) {
        listOfSales.add(new Sale(dateOfSale, m, thisClient.clientNumber));
    }
    
    public void printListOfLeases() {
        if (!currentLeases.isEmpty()) {
            for (int i = 0; i < currentLeases.size(); i++) {
                System.out.print(Integer.toString(i + 1) + ") ");
                currentLeases.get(i).describeThisLease();
                System.out.print("\n");
            }
        } else {
            System.out.println("The are no leases");
        }
    }
    
    public void printListOfSales() {
        if (!listOfSales.isEmpty()) {
            for (int i = 0; i < listOfSales.size(); i++) {
                System.out.print(Integer.toString(i + 1) + ") ");
                listOfSales.get(i).describeThisSale();
                System.out.print("\n");
            }
        } else {
            System.out.println("Nothing has been sold");
        }
    }
}
