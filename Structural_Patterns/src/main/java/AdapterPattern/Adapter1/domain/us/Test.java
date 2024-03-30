package AdapterPattern.Adapter1.domain.us;

public class Test {
    public static void main(String[] args) {
        USPowerSource usPowerSource = new USPowerProvider();

        USHomeAppliance usMixer = new USHomeAppliance("Mixer");
        usMixer.setPowerSource(usPowerSource);
        usMixer.start();
        usMixer.stop();
    }
}
