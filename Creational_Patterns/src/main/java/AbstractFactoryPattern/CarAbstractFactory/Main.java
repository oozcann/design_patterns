package AbstractFactoryPattern.CarAbstractFactory;

import AbstractFactoryPattern.CarAbstractFactory.factory.CarFactory;
import AbstractFactoryPattern.CarAbstractFactory.factory.MercedesCarFactory;
import AbstractFactoryPattern.CarAbstractFactory.factory.RenaultCarFactory;
import AbstractFactoryPattern.CarAbstractFactory.product.Car;
import AbstractFactoryPattern.CarAbstractFactory.product.car.Mercedes;
import AbstractFactoryPattern.CarAbstractFactory.product.car.Renault;

public class Main {
    public static void main(String[] args) {

        // Bu iyi bir örnek olmayabilir.

        CarFactory factory = new MercedesCarFactory();
        Car mercedes = new Mercedes(factory.createEngine(),factory.createWheel(), factory.createSeat());
        mercedes.showCarInfo();

        System.out.println("*****************************");

        CarFactory factory1 = new RenaultCarFactory();
        Car renault = new Renault(factory1.createEngine(), factory1.createWheel(), factory1.createSeat());
        renault.showCarInfo();
    }
}
