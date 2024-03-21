package BuilderPattern.Builder2;

import BuilderPattern.Builder1.model.*;

public class ComputerBuilderImpl implements ComputerBuilder{

    private Computer computer;

    private void buildRAM() {
        RAM ram = new RAM();
        computer.setRam(ram);
    }

    private void buildCPU() {
        CPU cpu = new CPU();
        computer.setCpu(cpu);
    }

    private void buildHardDrive() {
        HardDrive hardDrive = new HardDrive();
        computer.setHardDrive(hardDrive);
    }

    private void buildGraphicCard() {
        GraphicCard graphicCard = new GraphicCard();
        computer.setGraphicCard(graphicCard);
    }

    private void buildDisplay() {
        Display display = new Display();
        computer.setDisplay(display);
    }

    @Override
    public Computer build() {
        computer = new Computer();
        buildRAM();
        buildCPU();
        buildHardDrive();
        buildGraphicCard();
        buildDisplay();
        return computer;
    }
}
