package AbstractFactoryPattern.AbstractFactory1;

import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory1.factory.GUIFactory;
import AbstractFactoryPattern.AbstractFactory1.factory.ListFactory;

public class Main {
    public static void main (String[] args) {
        GUIFactory factory = new ListFactory();
        Component component = factory.create();
        component.paint();
    }
}
