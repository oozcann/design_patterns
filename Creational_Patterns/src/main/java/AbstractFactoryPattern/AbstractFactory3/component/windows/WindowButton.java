package AbstractFactoryPattern.AbstractFactory3.component.windows;

import AbstractFactoryPattern.AbstractFactory3.component.Button;

public class WindowButton extends Button {
    @Override
    public void paint() {
        System.out.println("Painted a Windows Button Component");
    }
}
