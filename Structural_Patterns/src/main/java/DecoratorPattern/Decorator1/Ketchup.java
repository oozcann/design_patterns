package DecoratorPattern.Decorator1;

public class Ketchup extends Topping{
    public Ketchup(Toastable toastTopping) {
        super(toastTopping, 1, "Ketçap");
    }
}
