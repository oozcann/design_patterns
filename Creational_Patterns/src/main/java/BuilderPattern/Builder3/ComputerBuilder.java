package BuilderPattern.Builder3;

import BuilderPattern.Builder1.model.*;

public interface ComputerBuilder {
    public ComputerBuilder buildRAM();
    public ComputerBuilder buildCPU();
    public ComputerBuilder buildHardDrive();
    public ComputerBuilder buildGraphicCard();
    public ComputerBuilder buildDisplay();
    public Computer buildComputer();
}
