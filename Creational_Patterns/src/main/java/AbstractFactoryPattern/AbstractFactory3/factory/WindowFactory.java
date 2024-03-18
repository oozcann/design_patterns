package AbstractFactoryPattern.AbstractFactory3.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory3.component.windows.WindowButton;
import AbstractFactoryPattern.AbstractFactory3.component.windows.WindowList;
import AbstractFactoryPattern.AbstractFactory3.component.windows.WindowTable;

public class WindowFactory implements GUIFactory {
    @Override
    public Component createButton() {
        return new WindowButton();
    }

    @Override
    public Component createList() {
        return new WindowList();
    }

    @Override
    public Component createTable() {
        return new WindowTable();
    }
}
