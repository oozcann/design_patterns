package IteratorPattern.Library;

import java.util.List;

public class BookIteratorImpl implements BookIterator {

    private List<Book> books;
    private int position;

    public BookIteratorImpl (List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size() && books.get(position) != null;
    }

    @Override
    public Book next() {
        return books.get(position++);
    }
}
