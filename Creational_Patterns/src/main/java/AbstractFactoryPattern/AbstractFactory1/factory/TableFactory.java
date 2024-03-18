package AbstractFactoryPattern.AbstractFactory1.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory1.component.Table;

public class TableFactory implements GUIFactory{

    @Override
    public Component create() {
        return new Table();
    }
}
