package FlyweightPattern.Flyweight1;

import java.util.*;

public class BookFactory implements Factory {
    private List<Character> as = new ArrayList<>();

    @Override
    public Character createCharacter(char c, boolean upperCase) {
        return new Character(c, upperCase);
    }

    @Override
    public Line createLine(int numberOfCharacters) {
        return new Line(numberOfCharacters);
    }

    @Override
    public Page createPage(int no, int numberOfLines) {
        return new Page(no, numberOfLines);
    }

    @Override
    public Book createBook(String name, int numberOfPages) {
        return new Book(name, numberOfPages);
    }
}