import java.util.Scanner;

public class PizzaMenu {

    RestaurantBuilder restaurantBuilder = new RestaurantBuilder();
    User user1 = new User();
    Scanner scan = new Scanner(System.in);
    String userInput;
    int userInputInt;

    public void menuStart() {
        restaurantBuilder.addToToppingsList();

        System.out.println("\n" +
                "          WELCOME TO KC PIZZA         \n" +
                "                     ___              \n" +
                "                    |  ~~--.          \n" +
                "                    |%=@%%/           \n" +
                "                    |o%%%/            \n" +
                "                 __ |%%o/             \n" +
                "           _,--~~ | |(_/ ._           \n" +
                "        ,/'  m%%%%| |o/ /  `\\.        \n" +
                "       /' m%%o(_)%| |/ /o%%m `\\       \n" +
                "     /' %%@=%o%%%o|   /(_)o%%% `\\     \n" +
                "    /  %o%%%%%=@%%|  /%%o%%@=%%  \\    \n" +
                "   |  (_)%(_)%%o%%| /%%%=@(_)%%%  |   \n" +
                "   | %%o%%%%o%%%(_|/%o%%o%%%%o%%% |   \n" +
                "   | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |   \n" +
                "   |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |   \n" +
                "    \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /    \n" +
                "     \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/     \n" +
                "       \\_ ~o%=@%(_)%o%%(_)%~ _/       \n" +
                "         `\\_~~o%%%o%%%%%~~_/'         \n" +
                "            `--..____,,--'            \n" +
                "                                      \n" +
                "\n" +
                "\n");

        System.out.println("Welcome to KC Pizzeria \n" +
                "[1] - Admin Login\n" +
                "[2] - Order a pizza\n" +
                "[3] - Exit");

        userInput = scan.nextLine();

        switch (userInput) {
            case "1":
                System.out.println("What's your admin username?");
                String username = scan.nextLine();
                System.out.println("What's your admin password");
                String password = scan.nextLine();
                restaurantBuilder.areCredentialsValid(username, password);
                restaurantBuilder.showInventory();
                break;
            case "2":
                restaurantBuilder.showAvailableToppings();
                Pizza userCreatedPizza =restaurantBuilder.createPizza();
                userCreatedPizza.printPizza();
                System.out.println("The cost of your pizza is: $" +restaurantBuilder.addPizzaPrice(userCreatedPizza));

                break;
            case "3":
                System.out.println("Thank you for visiting the pizzeria.");
                System.out.println( "// \"\"--.._\n" +
                        "||  (_)  _ \"-._\n" +
                        "||    _ (_)    '-.\n" +
                        "||   (_)   __..-'\n" +
                        " \\\\__..--\"\"");
                break;
            default:
                break;

        }
    }
}