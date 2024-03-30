package AdapterPattern.Adapter1.powerAdapter1;

import AdapterPattern.Adapter1.domain.tr.Appliance;
import AdapterPattern.Adapter1.domain.tr.TurkishHomeAppliance;
import AdapterPattern.Adapter1.domain.us.USPowerProvider;
import AdapterPattern.Adapter1.domain.us.USPowerSource;

public class Test {
    public static void main(String[] args) {
        USPowerSource usPowerSource = new USPowerProvider();
        USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);

        System.out.println();

        Appliance shaver = new TurkishHomeAppliance("Shaver");
        shaver.setPowerSource(uSTurkishPowerAdapter);
        shaver.start();
        shaver.stop();

    }
}
