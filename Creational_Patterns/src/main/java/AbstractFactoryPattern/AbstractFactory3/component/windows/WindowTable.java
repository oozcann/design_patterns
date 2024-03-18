package AbstractFactoryPattern.AbstractFactory3.component.windows;

import AbstractFactoryPattern.AbstractFactory3.component.Table;

public class WindowTable extends Table {

    @Override
    public void paint() {
        System.out.println("Painted a Windows Table Component");
    }
}
