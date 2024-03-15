package FactoryPattern.FactoryTransportation.TransportationFactory;

import FactoryPattern.FactoryTransportation.TransportationVehicles.Bus;
import FactoryPattern.FactoryTransportation.TransportationVehicles.TransportationVehicle;

public class BusFactory extends Transportation{
    @Override
    public TransportationVehicle provideTransportation() {
        return new Bus();
    }
}
