package AbstractFactoryPattern.CarAbstractFactory.product.wheel;

import AbstractFactoryPattern.CarAbstractFactory.product.Wheel;

public class MercedesWheel implements Wheel {
    @Override
    public void printBrand() {
        System.out.println("This is a wheel for Mercedes Car.");
    }
}
