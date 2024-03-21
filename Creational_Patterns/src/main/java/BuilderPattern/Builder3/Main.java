package BuilderPattern.Builder3;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new ComputerBuilderImpl();
        builder.buildRAM().buildCPU().buildDisplay().buildGraphicCard().buildHardDrive().buildComputer().start();
    }
}
