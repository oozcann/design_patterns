package DecoratorPattern.Decorator1;

public class Salad extends Topping{
    public Salad(Toastable toastTopping) {
        super(toastTopping, 2, "Salata");
    }
}
