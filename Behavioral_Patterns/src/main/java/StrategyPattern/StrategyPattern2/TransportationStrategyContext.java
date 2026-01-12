package StrategyPattern.StrategyPattern2;

import StrategyPattern.StrategyPattern2.strategies.TransportationStrategy;

public class TransportationStrategyContext {

    private TransportationStrategy transportationStrategy;

    public TransportationStrategyContext () {}

    public void selectTransportationStrategy (TransportationType transportationType) {
        this.transportationStrategy = TransportationStrategyFactory.getStrategy(transportationType);
    }

    public void calculate (int km) {
        if (transportationStrategy==null) {
            throw new RuntimeException("transportationStrategy unknown");
        }
        transportationStrategy.calculateDuration(km);
    }


}
