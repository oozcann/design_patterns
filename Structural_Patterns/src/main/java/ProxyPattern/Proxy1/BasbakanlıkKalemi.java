package ProxyPattern.Proxy1;

public class BasbakanlıkKalemi {
    private Basbakan basbakan;
    public BasbakanlıkKalemi(Basbakan basbakan){
        this.basbakan = new VekilBasbakan(basbakan);
    }

    public Basbakan banaBasbakaniVer(){
        System.out.println("Başbakanlık Kalemi: Tabi efendim");
        return basbakan;
    }
}
