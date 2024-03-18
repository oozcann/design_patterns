package AbstractFactoryPattern.AbstractFactory3.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory3.component.os.OSButton;
import AbstractFactoryPattern.AbstractFactory3.component.os.OSList;
import AbstractFactoryPattern.AbstractFactory3.component.os.OSTable;

public class OSFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new OSButton();
    }

    @Override
    public Component createList() {
        return new OSList();
    }

    @Override
    public Component createTable() {
        return new OSTable();
    }
}
