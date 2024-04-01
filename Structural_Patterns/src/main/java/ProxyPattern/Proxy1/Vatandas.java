package ProxyPattern.Proxy1;

public class Vatandas {
    private Basbakan basbakan;

    public Vatandas(BasbakanlıkKalemi kalem){
        basbakan = kalem.banaBasbakaniVer();
    }

    public String derdiniAnlat(){
        basbakan.dertDinle("Bir derdim var...");
        return "Yasasiiinnn!!!";
    }

    public String isIste(){
        basbakan.isBul("Oglum");
        return "Yasasiiinnn!!!";
    }
}
