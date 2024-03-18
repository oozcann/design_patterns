package AbstractFactoryPattern.AbstractFactory1.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Component;
import AbstractFactoryPattern.AbstractFactory1.component.List;

public class ListFactory implements GUIFactory{

    @Override
    public Component create() {
        return new List();
    }
}
