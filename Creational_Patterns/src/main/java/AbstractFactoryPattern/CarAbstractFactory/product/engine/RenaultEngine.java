package AbstractFactoryPattern.CarAbstractFactory.product.engine;

import AbstractFactoryPattern.CarAbstractFactory.product.Engine;

public class RenaultEngine implements Engine {
    @Override
    public void printEnginePower() {
        System.out.println("Renault car has a high power engine.");
    }
}
