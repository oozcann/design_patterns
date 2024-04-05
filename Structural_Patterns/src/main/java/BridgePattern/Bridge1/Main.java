package BridgePattern.Bridge1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ASubAbstraction(new AConcreteImplementation1()));
        client.start();


        client = new Client(new ASubAbstraction(new AConcreteImplementation2()));
        client.start();
    }
}
