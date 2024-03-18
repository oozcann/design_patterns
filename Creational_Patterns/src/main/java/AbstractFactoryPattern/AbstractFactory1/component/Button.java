package AbstractFactoryPattern.AbstractFactory1.component;

public class Button implements Component{

    @Override
    public void paint() {
        System.out.println("Painted a Button Component");
    }
}
