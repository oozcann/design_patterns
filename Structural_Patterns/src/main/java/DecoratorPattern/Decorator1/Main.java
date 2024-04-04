package DecoratorPattern.Decorator1;

public class Main {
    public static void main(String[] args) {
        Main test = new Main();
		test.makeAyvalıkToast1();
        test.makeAyvalıkToast2();
    }

    public void makeAyvalıkToast1(){
        Toastable ayvalıkToast = new ToastBread();
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
        ayvalıkToast = new Cheese(ayvalıkToast);
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
        ayvalıkToast = new Sausage(ayvalıkToast);
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
        ayvalıkToast = new Tomato(ayvalıkToast);
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
        ayvalıkToast = new Ketchup(ayvalıkToast);
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
        ayvalıkToast = new Salad(ayvalıkToast);
        System.out.println("Cost: " + ayvalıkToast.calculatePrice());
        printToppings(ayvalıkToast);
    }

    public void makeAyvalıkToast2(){
        Toastable ayvalıkToast = new ToastBread();
        ayvalıkToast = new Cheese(ayvalıkToast);
        ayvalıkToast = new Sausage(ayvalıkToast);
        ayvalıkToast = new Tomato(ayvalıkToast);
        ayvalıkToast = new Ketchup(ayvalıkToast);
        ayvalıkToast = new Salad(ayvalıkToast);
        System.out.println("\nCost: " + ayvalıkToast.calculatePrice());

        printToppings(ayvalıkToast);
    }

    private void printToppings(Toastable tost) {
        for(Topping topping : tost.getToppings())
            System.out.println(topping);
    }
}
