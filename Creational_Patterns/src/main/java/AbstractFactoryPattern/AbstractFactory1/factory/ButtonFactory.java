package AbstractFactoryPattern.AbstractFactory1.factory;

import AbstractFactoryPattern.AbstractFactory1.component.Button;
import AbstractFactoryPattern.AbstractFactory1.component.Component;

public class ButtonFactory implements GUIFactory{
    @Override
    public Component create() {
        return new Button();
    }
}
