package AbstractFactoryPattern.CarAbstractFactory.factory;


import AbstractFactoryPattern.CarAbstractFactory.product.Engine;
import AbstractFactoryPattern.CarAbstractFactory.product.Seat;
import AbstractFactoryPattern.CarAbstractFactory.product.Wheel;
import AbstractFactoryPattern.CarAbstractFactory.product.engine.RenaultEngine;
import AbstractFactoryPattern.CarAbstractFactory.product.seat.RenaultSeat;
import AbstractFactoryPattern.CarAbstractFactory.product.wheel.RenaultWheel;

public class RenaultCarFactory implements CarFactory {
    @Override
    public Wheel createWheel() {
        return new RenaultWheel();
    }

    @Override
    public Engine createEngine() {
        return new RenaultEngine();
    }

    @Override
    public Seat createSeat() {
        return new RenaultSeat();
    }
}
