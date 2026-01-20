package IteratorPattern.Library;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(3);
        warehouse.addBook(new Book("Ali'nin Hatıraları","Ahmet Öztürk"));
        warehouse.addBook(new Book("Veli'nin Hatıraları","Ahmet Öztürk"));
        warehouse.addBook(new Book("Ayşe'nin Hatıraları","Ahmet Öztürk"));

        BookIterator iterator = warehouse.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Kitap Adı : " + book.getName() + "\nYazarı : " + book.getAuthor());
            System.out.println("****************************");
        }

        Library library = new Library(3);
        library.addBook(new Book("Kütüphane1","Kütüphane"));
        library.addBook(new Book("Kütüphane2","Kütüphane"));
        library.addBook(new Book("Kütüphane3","Kütüphane"));

        BookIterator libraryIterator = library.iterator();
        while (libraryIterator.hasNext()) {
            Book book = libraryIterator.next();
            System.out.println("Kitap Adı : " + book.getName() + "\nYazarı : " + book.getAuthor());
            System.out.println("****************************");
        }

    }
}
