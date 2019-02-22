import java.util.ArrayList;

public class RestaurantBuilder {

    private ArrayList<Topping> toppingList = new ArrayList<>();
    private PizzaBuilder pizzaBuilder;
    private ArrayList<User> admins = new ArrayList<>();

    public void addAdmins() {

        admins.add(new User("KJ", "loop"));
        admins.add(new User("Christie", "Pojo"));

    }

    public boolean areCredentialsValid(String userName, String password) {
        boolean isValid = false;
        addAdmins();

        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getUserName().equalsIgnoreCase(userName) && admins.get(i).getPassWord().equals(password)) {
                isValid = true;
                System.out.println("You have logged in successfully!");
                break;
            }
        }

        return isValid;
    }

    public void addToToppingsList() {
        toppingList.add(new Topping("mushrooms", 10));
        toppingList.add(new Topping("onions", 10));
        toppingList.add(new Topping("pineapple", 10));
        toppingList.add(new Topping("pepporoni", 10));
    }

    public void showAvailableToppings() {
        System.out.println("The available toppings are listed below: ");
        for (int i = 0; i < toppingList.size(); i++) {
            if (toppingList.get(i).getAmount() != 0) {
                System.out.println(toppingList.get(i).getName());
            }
        }
    }



}
