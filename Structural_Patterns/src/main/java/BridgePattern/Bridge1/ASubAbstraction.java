package BridgePattern.Bridge1;

public class ASubAbstraction implements AnAbstraction{

    private AnAbstrationImplementation implementation;

    public ASubAbstraction(AnAbstrationImplementation implementation){
        this.implementation = implementation;
    }

    @Override
    public void doIt() {
        System.out.println("I am extending AnAbstraction.");
        implementation.doingIt();
    }
}
