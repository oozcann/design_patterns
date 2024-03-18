package AbstractFactoryPattern.AbstractFactory3.component.os;

import AbstractFactoryPattern.AbstractFactory3.component.Button;

public class OSButton extends Button {
    @Override
    public void paint() {
        System.out.println("Painted a OS Button Component");
    }
}
