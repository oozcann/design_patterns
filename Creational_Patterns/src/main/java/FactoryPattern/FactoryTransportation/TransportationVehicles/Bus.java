package FactoryPattern.FactoryTransportation.TransportationVehicles;

public class Bus implements TransportationVehicle{
    public Bus () {
        System.out.println("Bus has been provided as a transportation vehicle for your trip.");
    }
    public void checkIn() {
        System.out.println("Check-In successfull for the bus.");
    }
}
