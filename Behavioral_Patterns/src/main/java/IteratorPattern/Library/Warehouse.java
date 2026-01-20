package IteratorPattern.Library;

import java.util.ArrayList;
import java.util.List;

// Depo
public class Warehouse implements BookCollection {

    private List<Book> books;

    public Warehouse (int size) {
        books = new ArrayList<>(size);
    }

    public void addBook (Book book) {
        books.add(book);
    }

    @Override
    public BookIterator iterator() {
        return new BookIteratorImpl(books);
    }
}
