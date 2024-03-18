package AbstractFactoryPattern.AbstractFactory3;


import AbstractFactoryPattern.AbstractFactory3.factory.GUIFactory;
import AbstractFactoryPattern.AbstractFactory3.factory.OSFactory;

public class Main {
    public static void main (String[] args) {
        GUIFactory factory = new OSFactory();
        factory.createButton().paint();
    }
}
