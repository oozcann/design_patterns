package StrategyPattern.StrategyPattern2.strategies;

public class BusStrategy implements TransportationStrategy{
    private final int AVERAGE_SPEED = 50;

    @Override
    public void calculateDuration(int km) {
        System.out.println("Otobüs ile yola çıkılıyor. Belirtilen rota " + (km/AVERAGE_SPEED)*60 + " dakikada tamamlanacak.");
        System.out.println("********************");
        System.out.println("Hedefe ulaşıldı. Ulaşım Aracı: OTOBÜS");
    }
}
