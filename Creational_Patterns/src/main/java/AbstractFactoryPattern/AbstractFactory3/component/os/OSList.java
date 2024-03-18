package AbstractFactoryPattern.AbstractFactory3.component.os;

import AbstractFactoryPattern.AbstractFactory3.component.List;

public class OSList extends List {
    @Override
    public void paint() {
        System.out.println("Painted a OS List Component");
    }
}
