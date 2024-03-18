package AbstractFactoryPattern.AbstractFactory2;

import AbstractFactoryPattern.AbstractFactory1.component.Button;
import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory1.component.List;
import AbstractFactoryPattern.AbstractFactory1.component.Table;

public class GUIFactoryImpl implements GUIFactory{
    @Override
    public Component createButton() {
        return new Button();
    }

    @Override
    public Component createList() {
        return new List();
    }

    @Override
    public Component createTable() {
        return new Table();
    }
}
