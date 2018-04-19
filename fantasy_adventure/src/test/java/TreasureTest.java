import adventure.objective.treasure.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Chest full of gold", 100);
    }

    @Test
    public void getName(){
        assertEquals("Chest full of gold",treasure.getName());
    }

    @Test
    public void getValue(){
        assertEquals(100,treasure.getValue());
    }

    @Test
    public void isFound() {
        assertFalse(treasure.isHasBeenFound());
    }

    @Test
    public void canBeFound() {
        treasure.treasureFound();
        assertTrue(treasure.isHasBeenFound());
    }
}
