import java.util.ArrayList;
import java.util.Arrays;

public class Admin extends User {

    private ArrayList<User> admins = new ArrayList<>();

    public void addAdmin(){
        admins.add(new User("KJ","loop"));
        admins.add(new User("Christie", "Pojo"));
    }


}
