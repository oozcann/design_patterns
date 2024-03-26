package CompositePattern.Composite1;

public class Circle extends GraphicObject{

    public Circle(String name, String color) {
        super(name, color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cirle: " + name);
    }

    @Override
    public void erase() {
        System.out.println("Erasing a circle: " + name);
    }

    @Override
    public void paint() {
        System.out.println("Painting a circle. : " + name + " and its color is " + color);
    }
}
