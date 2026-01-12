package StrategyPattern.StrategyPattern2;

public class Main {
    public static void main(String[] args) {

        TransportationStrategyContext transportationStrategyContext = new TransportationStrategyContext();

        int km = 120;

        transportationStrategyContext.selectTransportationStrategy(TransportationType.AUTOMOBILE);
        transportationStrategyContext.calculate(km);

        transportationStrategyContext.selectTransportationStrategy(TransportationType.BUS);
        transportationStrategyContext.calculate(km);

        transportationStrategyContext.selectTransportationStrategy(TransportationType.CYCLE);
        transportationStrategyContext.calculate(km);

    }
}
