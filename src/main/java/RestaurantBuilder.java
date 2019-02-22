import java.util.ArrayList;

public class RestaurantBuilder {

    private ArrayList<Toppings> toppingsList;
    private PizzaBuilder pizzaBuilder;
    private ArrayList<User> admins = new ArrayList<>();

    public void addAdmins(){

            admins.add(new User("KJ","loop"));
            admins.add(new User("Christie", "Pojo"));

    }

    public boolean areCredentialsValid(String userName, String password){
        boolean isValid = false;

        for(int i = 0; i <admins.size(); i++){
            if(admins.get(i).getUserName().equalsIgnoreCase(userName) && admins.get(i).getPassWord().equals(password)) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }











}
