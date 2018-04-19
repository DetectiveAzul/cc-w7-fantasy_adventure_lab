import character.player.Classes.healer.Cleric;
import character.tools.HealingPotion;
import character.tools.HealingStaff;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingPotion potion;
    HealingStaff staff;

    @Before
    public void before(){
        potion = new HealingPotion("Large", 50,4,5);
        cleric = new Cleric("Baldy","Female", 89,40,150,potion,10);
        staff = new HealingStaff("+1",10,50,30);
    }

    @Test
    public void canHeal() {
        String result = "You pray and thanks to your faith, your Large Healing Potion heals you for 50";
        assertEquals(result, cleric.heal());
    }

    @Test
    public void canSwapTool() {
        cleric.changeHealingTool(staff);
        assertEquals("+1 Healing Staff", cleric.getEquipment().getName());
    }

    @Test
    public void canCheckStatus() {
        assertEquals("Your lifepoints are 40", cleric.checkStatus());
    }
}
