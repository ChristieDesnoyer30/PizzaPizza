public class PizzaBuilder {

    private Pizza newPizza;

    public PizzaBuilder() {
        this.newPizza = new Pizza();
    }




    @Override
    public String toString() {
        return "Your Pizza: " + newPizza;
    }



}
