import character.tools.HealingPotion;
import character.tools.HealingStaff;
import character.weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {
    private HealingPotion potion;
    private HealingStaff staff;

    @Before
    public void before() {
        potion = new HealingPotion("Large", 10, 1, 100);
        staff = new HealingStaff("+1", 8, 2, 90);
    }

    @Test
    public void hasName() {
        assertEquals("Large Healing Potion", potion.getName());
    }

    @Test
    public void hasRecovery() {
        assertEquals(8, staff.getRecovery());
    }

    @Test
    public void hasRange() {
        assertEquals(1, potion.getRange());
    }

    @Test
    public void canChangeDurability() {
        staff.setDurability(40);
        assertEquals(40, staff.getDurability());
    }
}
