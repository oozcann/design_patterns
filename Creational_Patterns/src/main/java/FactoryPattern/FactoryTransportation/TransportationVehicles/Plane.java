package FactoryPattern.FactoryTransportation.TransportationVehicles;

public class Plane implements TransportationVehicle{
    public Plane () {
        System.out.println("Plane has been provided as a transportation vehicle for your trip.");
    }
    public void checkIn() {
        System.out.println("Check-In successfull for the plane.");
    }
}
