package FactoryPattern.FactoryTransportation.TransportationVehicles;

public class Ship implements TransportationVehicle{
    public Ship () {
        System.out.println("Ship has been provided as a transportation vehicle for your trip.");
    }
    public void checkIn() {
        System.out.println("Check-In successfull for the ship.");
    }
}
