import character.player.Classes.fighter.Dwarf;
import character.weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;
    Axe axe2;

    @Before
    public void before(){
        axe = new Axe("Two Handed Battle", 10, 1, 100);
        axe2 = new Axe("Very old rusty", 10, 1, 100);
        dwarf = new Dwarf("Gimly","Male",120,100, 100, axe, 0);
    }

    @Test
    public void getName(){
        assertEquals("Gimly",dwarf.getName());
    }

    @Test
    public void getGender(){
        assertEquals("Male", dwarf.getGender());
    }
    @Test
    public void getAge(){
        assertEquals(120, dwarf.getAge());
    }

    @Test
    public void canChangeHealthPoints() {
        dwarf.setHealthPoints(90);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void canChangePowerPoints() {
        dwarf.setPowerPoints(50);
        assertEquals(50, dwarf.getPowerPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals("Two Handed Battle Axe", dwarf.getEquipment().getName());
    }

    @Test
    public void canChangeTreasure() {
        dwarf.setTotalTreasureValue(1000);
        assertEquals(1000, dwarf.getTotalTreasureValue());
    }

    @Test
    public void canSwingWeapon() {
        assertEquals("You swing your Two Handed Battle Axe with Dwarf bravery",dwarf.swingWeapon());
    }

    @Test
    public void canDefend() {
        assertEquals("You stood defensively against every foe",dwarf.defend());
    }

    @Test
    public void canCharge() {
        assertEquals("You shout a Dwarvish Swear before rushing against your enemy",dwarf.charge());
    }

    @Test
    public void canChangeWeapon() {
        assertEquals("Two Handed Battle Axe", dwarf.getEquipment().getName());
        dwarf.changeWeapon(axe2);
        assertEquals("Very old rusty Axe", dwarf.getEquipment().getName());
    }
}
