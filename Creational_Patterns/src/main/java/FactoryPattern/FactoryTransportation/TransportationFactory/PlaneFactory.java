package FactoryPattern.FactoryTransportation.TransportationFactory;

import FactoryPattern.FactoryTransportation.TransportationVehicles.Plane;
import FactoryPattern.FactoryTransportation.TransportationVehicles.TransportationVehicle;

public class PlaneFactory extends Transportation{
    @Override
    public TransportationVehicle provideTransportation() {
        return new Plane();
    }
}
