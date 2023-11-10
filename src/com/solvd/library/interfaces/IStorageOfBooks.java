package com.solvd.library.interfaces;

public interface IStorageOfBooks {
    List<Book> searchForBooksByTitle(String searchedTitle);
    List<Book> searchForBooksByGenre(LiteratureGenre searchedGenre)
}
