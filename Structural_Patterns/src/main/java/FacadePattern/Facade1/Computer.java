package FacadePattern.Facade1;

public class Computer {
    private CPU cpu;
    private HardDrive hardDrive;
    private Display display;

    public Computer () {
        cpu = new CPU();
        hardDrive = new HardDrive();
        display = new Display();
    }

    public void start() {
        cpu.start();
        hardDrive.start();
        display.start();
        System.out.println("Computer started succesfully.");
    }
}
