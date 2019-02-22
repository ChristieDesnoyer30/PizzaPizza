import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantBuilderTest {
    private RestaurantBuilder restaurantBuilder;

    @Before
    public void create() {
        restaurantBuilder = new RestaurantBuilder();
    }
    @Test
    public void areCredentialsValid() {
        restaurantBuilder.addAdmins();

        boolean actualBooleanResult = restaurantBuilder.areCredentialsValid("Christie", "Pojo");

        assertEquals(true, actualBooleanResult );
    }
}