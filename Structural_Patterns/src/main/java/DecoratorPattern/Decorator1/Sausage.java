package DecoratorPattern.Decorator1;

public class Sausage extends Topping{
    public Sausage(Toastable toastTopping) {
        super(toastTopping, 3, "Sucuk");
    }
}
