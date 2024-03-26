package CompositePattern.Composite1;

public class Ellipse extends GraphicObject{

    public Ellipse(String name, String color) {
        super(name, color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing an ellipse: " + name);
    }
    @Override
    public void erase() {
        System.out.println("Erasing an ellipse: " + name);
    }
    @Override
    public void paint() {
        System.out.println("Painting an ellipse. : " + name + " and its color is " + color);
    }
}
