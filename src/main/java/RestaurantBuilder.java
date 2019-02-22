import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantBuilder {

    private ArrayList<Topping> toppingList = new ArrayList<>();
    private Pizza newPizza;
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
        toppingList.add(new Topping ("Cheese", 100));
        toppingList.add(new Topping("Mushrooms", 10));
        toppingList.add(new Topping("Onions", 1));
        toppingList.add(new Topping("Pineapple", 10));
        toppingList.add(new Topping("Pepperoni", 10));
    }

    public void showAvailableToppings() {
        System.out.println("The available toppings are listed below: ");
        for (int i = 0; i < toppingList.size(); i++) {
            if (toppingList.get(i).getAmount() !=0) {
                System.out.println(toppingList.get(i).getName());
            }
        }
    }

    public void showInventory() {

        for (int i = 0; i < toppingList.size(); i++) {
            if (toppingList.get(i).getAmount() < 2) {
                System.out.println(toppingList.get(i) + " ****LOW STOCK****");
            } else{

                System.out.println( toppingList.get(i));
            }
        }
    }


    public ArrayList<Topping> addToppingsToPizza(){
        Scanner scan = new Scanner(System.in);
        boolean continueToAddToppings = false;
        ArrayList<Topping> pizzaToppingsList = new ArrayList<>();

        do{
            System.out.println("Which topping would you like to add?");
            String toppingInput = scan.nextLine();

            pizzaToppingsList.add(new Topping(toppingInput));

            System.out.println("Add another? [y]/ [n]");
            String userChoice = scan.nextLine();
            if(userChoice.equalsIgnoreCase("y")){
                continueToAddToppings = true;
            }else{
                continueToAddToppings = false;
            }

        }while(continueToAddToppings);


        return pizzaToppingsList;
    }


    public Pizza createPizza() {

        newPizza = new Pizza();

        ArrayList<Topping> userToppingList = addToppingsToPizza();

        newPizza.setToppingType(userToppingList);
        return newPizza;
    }

    public double addPizzaPrice(Pizza pizza){
        double pizzaToppingsPrice =0.50;
        double pizzaBasePrice = 9.99;

        double pizzaPrice = ((pizza.getToppingType().size()) * pizzaToppingsPrice) + pizzaBasePrice;

        return pizzaPrice;

    }


}
