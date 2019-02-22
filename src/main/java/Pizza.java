import java.util.ArrayList;

public class Pizza {

    private String cheeseType;
    private ArrayList<Topping> toppingType;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza() {
          this.cheeseType = "regular";
    }

    public Pizza(String cheeseType, Topping toppingType) {
        this.cheeseType = cheeseType;
        this.toppingType = new ArrayList<>();
    }

    public Pizza(Topping toppingType) {
        this.cheeseType = "Regular";
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

    public void printPizza(){

        System.out.println("Your pizza:");
        System.out.println("Cheese Type: " + cheeseType);
        for(Topping topping : toppingType)  {
            System.out.println(topping.getName());
        }
    }



    @Override
    public String toString() {
        return "Your pizza: " +
                 cheeseType + "cheese " +
                ", toppings: " + toppingType;


    }
}
