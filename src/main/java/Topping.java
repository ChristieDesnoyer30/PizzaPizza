import java.util.ArrayList;

public class Topping {

    private String name;
    private int amount;

    public Topping(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Topping name: " +
               name +
                ", amount: " + amount;
    }
}
