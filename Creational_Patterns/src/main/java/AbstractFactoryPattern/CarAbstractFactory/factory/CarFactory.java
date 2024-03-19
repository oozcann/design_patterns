package AbstractFactoryPattern.CarAbstractFactory.factory;

import AbstractFactoryPattern.CarAbstractFactory.product.Engine;
import AbstractFactoryPattern.CarAbstractFactory.product.Seat;
import AbstractFactoryPattern.CarAbstractFactory.product.Wheel;

public interface CarFactory {
    /**
     * Araba üretmek isteyen concrete class'lar tekerler, motor ve koltuk üretmelidir.
     */
    public Wheel createWheel();
    public Engine createEngine();
    public Seat createSeat();
}
