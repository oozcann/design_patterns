package BuilderPattern.Builder1;

import BuilderPattern.Builder1.builder.ComputerBuilder;
import BuilderPattern.Builder1.builder.ComputerBuilderImpl;
import BuilderPattern.Builder1.model.Computer;
import BuilderPattern.Builder1.model.GraphicCard;
import BuilderPattern.Builder1.model.RAM;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilderImpl();
        Computer computer = builder.buildComputer();
        computer.start();

        RAM ram = builder.buildRAM();
        GraphicCard graphicCard = builder.buildGraphicCard();

        ram.startServices();
    }
}
