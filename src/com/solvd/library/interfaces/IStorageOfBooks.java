package com.solvd.library.interfaces;

import com.solvd.library.Book;
import com.solvd.library.LiteratureGenre;

import java.util.List;

public interface IStorageOfBooks {
    List<Book> searchForBooksByTitle(String searchedTitle);
    List<Book> searchForBooksByGenre(LiteratureGenre searchedGenre);
}
