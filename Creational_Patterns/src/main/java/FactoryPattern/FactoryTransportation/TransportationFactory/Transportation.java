package FactoryPattern.FactoryTransportation.TransportationFactory;

import FactoryPattern.FactoryTransportation.TransportationVehicles.TransportationVehicle;

public abstract class Transportation {
    abstract TransportationVehicle provideTransportation();
    public void informIfTrasportationReady () {
        System.out.println("Transportation is ready. Enjoy your vacation.");
    }
}
