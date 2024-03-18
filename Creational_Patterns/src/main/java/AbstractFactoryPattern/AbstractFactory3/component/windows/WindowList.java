package AbstractFactoryPattern.AbstractFactory3.component.windows;

import AbstractFactoryPattern.AbstractFactory3.component.List;

public class WindowList extends List {
    @Override
    public void paint() {
        System.out.println("Painted a Windows List Component");
    }
}
