package AbstractFactoryPattern.AbstractFactory1.component;

public class Table implements Component{

    @Override
    public void paint() {
        System.out.println("Painted a Table Component");
    }
}
