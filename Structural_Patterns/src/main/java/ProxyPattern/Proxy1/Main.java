package ProxyPattern.Proxy1;

public class Main {
    public static void main(String[] args) {
        System.err.println("*** Vatandaş başbakanlık kalemine gelir ve süreç başlar. ***");

        Basbakan basbakan = new GercekBasbakan();
        BasbakanlıkKalemi kalem = new BasbakanlıkKalemi(basbakan);

        Vatandas riza = new Vatandas(kalem);
        riza.derdiniAnlat();
        riza.isIste();
    }
}
