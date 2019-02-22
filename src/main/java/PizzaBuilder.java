public class PizzaBuilder {

    private Pizza newPizza;

    public PizzaBuilder(Pizza newPizza) {
        this.newPizza = newPizza;
    }

    @Override
    public String toString() {
        return "Your Pizza: " + newPizza;
    }

}
