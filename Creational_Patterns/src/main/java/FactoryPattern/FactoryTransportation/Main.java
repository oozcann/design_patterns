package FactoryPattern.FactoryTransportation;

import FactoryPattern.FactoryTransportation.TransportationFactory.BusFactory;
import FactoryPattern.FactoryTransportation.TransportationFactory.PlaneFactory;
import FactoryPattern.FactoryTransportation.TransportationFactory.ShipFactory;
import FactoryPattern.FactoryTransportation.TransportationFactory.Transportation;
import FactoryPattern.FactoryTransportation.TransportationVehicles.TransportationVehicle;

public class Main {
    public static void main (String[] args) {
        /*
        Transportation factory = new BusFactory();
        factory.informIfTrasportationReady();
        */
        TransportationVehicle vehicle = new BusFactory().provideTransportation();
        vehicle.checkIn();

        TransportationVehicle vehicle2 = new PlaneFactory().provideTransportation();
        vehicle2.checkIn();

        TransportationVehicle vehicle3 = new ShipFactory().provideTransportation();
        vehicle3.checkIn();
    }
}
