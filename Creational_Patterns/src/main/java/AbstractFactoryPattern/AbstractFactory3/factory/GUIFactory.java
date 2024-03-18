package AbstractFactoryPattern.AbstractFactory3.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Component;

public interface GUIFactory {
    Component createButton();
    Component createList();
    Component createTable();
}
