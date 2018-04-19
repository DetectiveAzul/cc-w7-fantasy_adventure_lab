import character.creatures.Dragon;
import character.creatures.Unicorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Dragon dragon;
    Unicorn unicorn;

    @Before
    public void before(){
        dragon = new Dragon("Smaug","Dragon","Large");
        unicorn = new Unicorn("Pointy","Unicorn","medium");
    }

    @Test
    public void hasName(){
        assertEquals("Smaug",dragon.getName());
    }

    @Test
    public void hasSpecies() {
        assertEquals("Unicorn",unicorn.getSpecies());
    }

    @Test
    public void hasSize() {
        assertEquals("Large",dragon.getSize());
    }

    @Test
    public void canBeRidden() {
        assertEquals("Your Dragon spread its wings and flies over the clouds",dragon.ride());
        assertEquals("Your Unicorn runs over the land as fast as the wind",unicorn.ride());
    }
}
