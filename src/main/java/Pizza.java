import java.util.ArrayList;

public class Pizza {

    private String cheeseType;
    private ArrayList<Topping> toppingType;

    public Pizza(String cheeseType, Topping toppingType) {
        this.cheeseType = cheeseType;
        this.toppingType = new ArrayList<>();
    }

    public Pizza(Topping toppingType) {
        this.cheeseType = "regular";
        this.toppingType = new ArrayList<>();
    }


    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public ArrayList<Topping> getToppingType() {
        return toppingType;
    }

    public void setToppingType(ArrayList<Topping> toppingType) {
        this.toppingType = toppingType;
    }

    @Override
    public String toString() {
        return "Your pizza: " +
                 cheeseType + "cheese " +
                ", toppings: " + toppingType;
    }
}
