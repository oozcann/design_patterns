package IteratorPattern.Library;

import java.util.List;

public class Library implements BookCollection {
    private Book[] books;
    private int index;

    public Library (int size) {
        books = new Book[size];
    }

    public void addBook (Book book) {
        if (index < books.length) {
            books[index++] = book;
        }
    }


    @Override
    public BookIterator iterator() {
        return new BookIteratorImpl(List.of(books));
    }
}
