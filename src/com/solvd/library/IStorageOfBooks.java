package com.solvd.library;

public interface IStorageOfBooks {
    List<Book> searchForBooksByTitle(String searchedTitle);
    List<Book> searchForBooksByGenre(LiteratureGenre searchedGenre)
}
