import character.player.Classes.fighter.Barbarian;
import character.player.Classes.fighter.Dwarf;
import character.weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Axe axe2;

    @Before
    public void before(){
        axe = new Axe("Two Handed Battle", 10, 1, 100);
        axe2 = new Axe("Very old rusty", 10, 1, 100);
        barbarian = new Barbarian("Conan","Male",28,200, 50, axe, 0);
    }

    @Test
    public void getName(){
        assertEquals("Conan",barbarian.getName());
    }

    @Test
    public void getGender(){
        assertEquals("Male", barbarian.getGender());
    }
    @Test
    public void getAge(){
        assertEquals(28, barbarian.getAge());
    }

    @Test
    public void canChangeHealthPoints() {
        barbarian.setHealthPoints(90);
        assertEquals(90, barbarian.getHealthPoints());
    }

    @Test
    public void canChangePowerPoints() {
        barbarian.setPowerPoints(90);
        assertEquals(90, barbarian.getPowerPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals("Two Handed Battle Axe", barbarian.getEquipment().getName());
    }

    @Test
    public void canChangeTreasure() {
        barbarian.setTotalTreasureValue(1000);
        assertEquals(1000, barbarian.getTotalTreasureValue());
    }

    @Test
    public void canSwingWeapon() {
        assertEquals("You scream while you hold your Two Handed Battle Axe over your head before striking", barbarian.swingWeapon());
    }

    @Test
    public void canDefend() {
        assertEquals("You kick your enemies far from you",barbarian.defend());
    }

    @Test
    public void canCharge() {
        assertEquals("You jump fiercely towards your enemy",barbarian.charge());
    }

    @Test
    public void canChangeWeapon() {
        assertEquals("Two Handed Battle Axe", barbarian.getEquipment().getName());
        barbarian.changeWeapon(axe2);
        assertEquals("Very old rusty Axe", barbarian.getEquipment().getName());
    }
}
