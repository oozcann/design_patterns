package FactoryPattern.FactoryTransportation.TransportationFactory;

import FactoryPattern.FactoryTransportation.TransportationVehicles.Ship;
import FactoryPattern.FactoryTransportation.TransportationVehicles.TransportationVehicle;

public class ShipFactory extends Transportation{

    @Override
    public TransportationVehicle provideTransportation() {
        return new Ship();
    }
}
