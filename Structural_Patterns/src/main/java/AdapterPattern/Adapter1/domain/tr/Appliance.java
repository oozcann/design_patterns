package AdapterPattern.Adapter1.domain.tr;

public interface Appliance {
    public void setPowerSource(TurkishPowerSource powerSource);

    public void start();

    public void stop();
}
