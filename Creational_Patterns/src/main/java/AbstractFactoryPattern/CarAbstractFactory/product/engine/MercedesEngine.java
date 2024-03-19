package AbstractFactoryPattern.CarAbstractFactory.product.engine;

import AbstractFactoryPattern.CarAbstractFactory.product.Engine;

public class MercedesEngine implements Engine {
    @Override
    public void printEnginePower() {
        System.out.println("Mercedes car has a high power engine.");
    }
}
