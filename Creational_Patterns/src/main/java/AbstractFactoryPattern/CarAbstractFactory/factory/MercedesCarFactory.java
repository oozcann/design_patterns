package AbstractFactoryPattern.CarAbstractFactory.factory;

import AbstractFactoryPattern.CarAbstractFactory.product.Engine;
import AbstractFactoryPattern.CarAbstractFactory.product.Seat;
import AbstractFactoryPattern.CarAbstractFactory.product.Wheel;
import AbstractFactoryPattern.CarAbstractFactory.product.engine.MercedesEngine;
import AbstractFactoryPattern.CarAbstractFactory.product.seat.MercedesSeat;
import AbstractFactoryPattern.CarAbstractFactory.product.wheel.MercedesWheel;

public class MercedesCarFactory implements CarFactory{

    @Override
    public Wheel createWheel() {
        return new MercedesWheel();
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }

    @Override
    public Seat createSeat() {
    return new MercedesSeat();
    }
}
