import java.util.ArrayList;

public class Pizza {

    private String cheeseType;
    private ArrayList<Toppings> toppingsType;

    public Pizza(String cheeseType, Toppings toppingsType) {
        this.cheeseType = cheeseType;
        this.toppingsType = new ArrayList<>();
    }

    public Pizza(Toppings toppingsType) {
        this.cheeseType = "regular";
        this.toppingsType = new ArrayList<>();
    }


    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public ArrayList<Toppings> getToppingsType() {
        return toppingsType;
    }

    public void setToppingsType(ArrayList<Toppings> toppingsType) {
        this.toppingsType = toppingsType;
    }

    @Override
    public String toString() {
        return "Your pizza: " +
                 cheeseType + "cheese " +
                ", toppings: " + toppingsType;
    }
}
