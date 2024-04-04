package DecoratorPattern.Decorator1;

public class Tomato extends Topping{
    public Tomato(Toastable toastTopping) {
        super(toastTopping, 2, "Domates");
    }
}
