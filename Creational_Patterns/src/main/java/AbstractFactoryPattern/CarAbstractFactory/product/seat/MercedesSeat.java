package AbstractFactoryPattern.CarAbstractFactory.product.seat;

import AbstractFactoryPattern.CarAbstractFactory.product.Seat;

public class MercedesSeat implements Seat {
    @Override
    public void printSeatColor() {
        System.out.println("The seat color of Mercedes car is gray.");
    }
}
