package AbstractFactoryPattern.CarAbstractFactory.product.seat;

import AbstractFactoryPattern.CarAbstractFactory.product.Seat;

public class RenaultSeat implements Seat {
    @Override
    public void printSeatColor() {
        System.out.println("The seat color of Renault car is black.");
    }
}
