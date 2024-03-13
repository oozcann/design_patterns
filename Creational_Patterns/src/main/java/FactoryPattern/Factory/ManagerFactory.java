package FactoryPattern.Factory;

public class ManagerFactory implements Factory{

    @Override
    public Manager create() {
        return new Manager("Ali Öztürk","İnsan Kaynakları");
    }
}
