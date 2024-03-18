package AbstractFactoryPattern.AbstractFactory3.component.os;

import AbstractFactoryPattern.AbstractFactory3.component.Table;

public class OSTable extends Table {
    @Override
    public void paint() {
        System.out.println("Painted a OS Table Component");
    }
}
