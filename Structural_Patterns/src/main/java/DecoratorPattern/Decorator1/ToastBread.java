package DecoratorPattern.Decorator1;

import java.util.ArrayList;
import java.util.List;

public class ToastBread implements Toastable{
    private static String name;
    protected int price;

    public ToastBread() {
        this.name = "Tost Ekmaği";
        this.price = 5;
    }

    @Override
    public int calculatePrice() {
        return price;
    }

    @Override
    public List<Topping> getToppings() {
        return new ArrayList<Topping>();
    }
}
