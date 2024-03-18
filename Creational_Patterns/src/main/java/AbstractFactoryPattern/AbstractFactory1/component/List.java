package AbstractFactoryPattern.AbstractFactory1.component;

public class List implements Component{
    @Override
    public void paint() {
        System.out.println("Painted a List Component");
    }
}
