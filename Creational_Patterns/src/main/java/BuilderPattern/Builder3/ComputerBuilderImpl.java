package BuilderPattern.Builder3;

import BuilderPattern.Builder1.model.*;

public class ComputerBuilderImpl implements ComputerBuilder{

    private static ComputerBuilderImpl builder = new ComputerBuilderImpl();
    private Computer computer;

    public ComputerBuilderImpl () {
        computer = new Computer();
    }
    public static ComputerBuilderImpl getBuilder() {
        return builder;
    }

    @Override
    public ComputerBuilder buildRAM() {
        RAM ram = new RAM();
        computer.setRam(ram);
        return builder;
    }

    @Override
    public ComputerBuilder buildCPU() {
        CPU cpu = new CPU();
        computer.setCpu(cpu);
        return builder;
    }

    @Override
    public ComputerBuilder buildHardDrive() {
        HardDrive hardDrive = new HardDrive();
        computer.setHardDrive(hardDrive);
        return builder;
    }

    @Override
    public ComputerBuilder buildGraphicCard() {
        GraphicCard graphicCard = new GraphicCard();
        computer.setGraphicCard(graphicCard);
        return builder;
    }

    @Override
    public ComputerBuilder buildDisplay() {
        Display display = new Display();
        computer.setDisplay(display);
        return builder;
    }

    @Override
    public Computer buildComputer() {
        return computer;
    }
}
