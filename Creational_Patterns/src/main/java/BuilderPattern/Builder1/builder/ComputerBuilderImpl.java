package BuilderPattern.Builder1.builder;

import BuilderPattern.Builder1.model.*;

public class ComputerBuilderImpl implements ComputerBuilder{

    private Computer computer;

    @Override
    public RAM buildRAM() {
        RAM ram = new RAM();
        computer.setRam(ram);
        return ram;
    }

    @Override
    public CPU buildCPU() {
        CPU cpu = new CPU();
        computer.setCpu(cpu);
        return cpu;
    }

    @Override
    public HardDrive buildHardDrive() {
        HardDrive hardDrive = new HardDrive();
        computer.setHardDrive(hardDrive);
        return hardDrive;
    }

    @Override
    public GraphicCard buildGraphicCard() {
        GraphicCard graphicCard = new GraphicCard();
        computer.setGraphicCard(graphicCard);
        return graphicCard;
    }

    @Override
    public Display buildDisplay() {
        Display display = new Display();
        computer.setDisplay(display);
        return display;
    }

    @Override
    public Computer buildComputer() {
        computer = new Computer();
        buildRAM();
        buildCPU();
        buildHardDrive();
        buildGraphicCard();
        buildDisplay();
        return computer;
    }
}
