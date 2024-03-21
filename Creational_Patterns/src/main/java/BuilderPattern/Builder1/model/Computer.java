package BuilderPattern.Builder1.model;

public class Computer {
    RAM ram;
    CPU cpu;
    HardDrive hardDrive;
    GraphicCard graphicCard;
    Display display;

    public Computer() {
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GraphicCard graphicCard) {
        this.graphicCard = graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void start() {
        ram.startServices();
        cpu.start();
        graphicCard.start();
        hardDrive.start();
        display.start();
    }
}
