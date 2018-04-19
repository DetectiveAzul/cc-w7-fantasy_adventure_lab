import character.weapon.Axe;
import character.weapon.Hammer;
import character.weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {
    private Axe axe;
    private Hammer hammer;
    private Sword sword;

    @Before
    public void before() {
        axe = new Axe("Two handed", 10, 1, 100);
        sword = new Sword("Long", 8, 2, 90);
        hammer = new Hammer("Battle", 12, 3, 80);
    }

    @Test
    public void hasName() {
        assertEquals("Two handed Axe", axe.getName());
    }

    @Test
    public void hasDamge() {
        assertEquals(8, sword.getDamage());
    }

    @Test
    public void hasRange() {
        assertEquals(3, hammer.getRange());
    }

    @Test
    public void canChangeDurability() {
        axe.setDurability(40);
        assertEquals(40, axe.getDurability());
    }
}
