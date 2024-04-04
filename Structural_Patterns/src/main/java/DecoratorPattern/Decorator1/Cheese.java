package DecoratorPattern.Decorator1;

public class Cheese extends Topping{
    public Cheese(Toastable toastTopping) {
        super(toastTopping, 3, "Peynir");
    }
}
