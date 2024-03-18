package AbstractFactoryPattern.AbstractFactory2;


public class Main {
    public static void main (String[] args) {
        GUIFactory factory = new GUIFactoryImpl();
        factory.createButton().paint();
        factory.createList().paint();
        factory.createTable().paint();
    }
}
