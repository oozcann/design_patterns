package AdapterPattern.Adapter1.powerAdapter2;

import AdapterPattern.Adapter1.domain.tr.Appliance;
import AdapterPattern.Adapter1.domain.tr.TurkishHomeAppliance;
import AdapterPattern.Adapter1.domain.us.USPowerProvider;
import AdapterPattern.Adapter1.domain.us.USPowerSource;

public class Test {
    public static void main(String[] args) {
        USPowerSource usPowerSource = new USPowerProvider();
        USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);

        System.out.println();

        Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
        turkishMixer.setPowerSource(uSTurkishPowerAdapter);
        turkishMixer.start();
        turkishMixer.stop();

        System.out.println();

        Appliance turkishBroom = new TurkishHomeAppliance("Broom");
        turkishBroom.setPowerSource(uSTurkishPowerAdapter);
        turkishBroom.start();
        turkishBroom.stop();
    }
}
