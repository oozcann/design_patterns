package BuilderPattern.Builder1.builder;

import BuilderPattern.Builder1.model.*;

public interface ComputerBuilder {
    RAM buildRAM();
    CPU buildCPU();
    HardDrive buildHardDrive();
    GraphicCard buildGraphicCard();
    Display buildDisplay();
    Computer buildComputer();
}
