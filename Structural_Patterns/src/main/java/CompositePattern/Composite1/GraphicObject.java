package CompositePattern.Composite1;

public abstract class GraphicObject implements Graphic{
    protected String name;
    protected String color;

    public GraphicObject(String name, String color) {
        this.name =name;
        this.color = color;
    }

    public String toString() {
        return "Graphic Object: " + name + " Color: " + color;
    }
}
