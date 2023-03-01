import org.junit.*;
import praktikum.*;
import java.util.*;

public class DataBaseTest {
    Database database;

    @Before
    public void setUp() {
        database = new Database();
    }

    @Test
    public void availableBunTest() {
        List<Bun> bun = database.availableBuns();
        Assert.assertFalse(bun.isEmpty());
    }

    @Test
    public void availableIngredientsTest() {
        List<Ingredient> ingredients = database.availableIngredients();
        Assert.assertFalse(ingredients.isEmpty());
    }
}

