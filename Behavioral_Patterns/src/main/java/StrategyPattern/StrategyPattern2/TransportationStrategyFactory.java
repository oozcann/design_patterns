package StrategyPattern.StrategyPattern2;

import StrategyPattern.StrategyPattern2.strategies.AutomobileStrategy;
import StrategyPattern.StrategyPattern2.strategies.BusStrategy;
import StrategyPattern.StrategyPattern2.strategies.CycleStrategy;
import StrategyPattern.StrategyPattern2.strategies.TransportationStrategy;

public class TransportationStrategyFactory {

    public static TransportationStrategy getStrategy(TransportationType transportationType) {
        if (transportationType.equals(TransportationType.AUTOMOBILE)) {
            return new AutomobileStrategy();
        } else if (transportationType.equals(TransportationType.BUS)) {
            return new BusStrategy();
        } else if (transportationType.equals(TransportationType.CYCLE)) {
            return new CycleStrategy();
        } else {
            throw new RuntimeException("TransportationType unknown");
        }
    }

}
