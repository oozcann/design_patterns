package StrategyPattern.StrategyPattern2.strategies;

public class AutomobileStrategy implements TransportationStrategy {

    private final int AVERAGE_SPEED = 80;

    @Override
    public void calculateDuration(int km) {
        System.out.println("Araba ile yola çıkılıyor. Belirtilen rota " + ((km/AVERAGE_SPEED))*60.f + " dakikada tamamlanacak.");
        System.out.println("********************");
        System.out.println("Hedefe ulaşıldı. Ulaşım Aracı: ARABA");
    }
}
