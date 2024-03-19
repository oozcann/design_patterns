package AbstractFactoryPattern.CarAbstractFactory.product.car;

import AbstractFactoryPattern.CarAbstractFactory.product.Car;
import AbstractFactoryPattern.CarAbstractFactory.product.Engine;
import AbstractFactoryPattern.CarAbstractFactory.product.Seat;
import AbstractFactoryPattern.CarAbstractFactory.product.Wheel;

public class Renault implements Car {
    private Engine engine;
    private Wheel wheel;
    private Seat seat;

    public Renault(Engine engine, Wheel wheel, Seat seat) {
        this.engine = engine;
        this.wheel = wheel;
        this.seat = seat;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @Override
    public void showCarInfo() {
        System.out.println("***Renault***");
        wheel.printBrand();
        engine.printEnginePower();
        seat.printSeatColor();
    }
}
