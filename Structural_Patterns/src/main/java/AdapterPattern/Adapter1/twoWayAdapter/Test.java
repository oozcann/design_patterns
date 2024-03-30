package AdapterPattern.Adapter1.twoWayAdapter;

import AdapterPattern.Adapter1.domain.tr.Appliance;
import AdapterPattern.Adapter1.domain.tr.TurkishHomeAppliance;
import AdapterPattern.Adapter1.domain.tr.TurkishPowerProvider;
import AdapterPattern.Adapter1.domain.tr.TurkishPowerSource;
import AdapterPattern.Adapter1.domain.us.USHomeAppliance;
import AdapterPattern.Adapter1.domain.us.USPowerProvider;
import AdapterPattern.Adapter1.domain.us.USPowerSource;

public class Test {
    public static void main(String[] args) {
        // In US with Turkish home appliance
        USPowerSource usPowerSource = new USPowerProvider();
        TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter1 = new TwoWayUSTurkishPowerAdapter(usPowerSource);

        System.out.println();

        Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
        turkishMixer.setPowerSource(twoWayUSTurkishPowerAdapter1);
        turkishMixer.start();
        turkishMixer.stop();

        System.out.println();

        // In Turkey with US home appliance
        TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();
        TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter2 = new TwoWayUSTurkishPowerAdapter(turkishPowerSource);

        System.out.println();

        USHomeAppliance usBroom = new USHomeAppliance("Broom");
        usBroom.setPowerSource(twoWayUSTurkishPowerAdapter2);
        usBroom.start();
        usBroom.stop();
    }
}
