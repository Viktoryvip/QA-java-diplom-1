import praktikum.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.*;

public class IngredientTest {
    Ingredient ingredient;

    @Before
    public void setup() {
        ingredient = new Ingredient(FILLING, "dinosaur", 200.0F);
    }

    @Test
    public void getPriceTest() {
        assertEquals("Price is not correct", 200.0F, ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        assertEquals("Name is not correct", "dinosaur", ingredient.getName());
    }
}

