package CompositePattern.Composite1;

import java.util.Collection;

public interface CompositeGraphic {
    public void addGraphic(Graphic graphic);

    public void removeGraphic(Graphic graphic);

    public Collection<Graphic> getGraphics();

    public void listGraphic();
}
