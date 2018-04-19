import character.player.Classes.fighter.Barbarian;
import character.player.Classes.fighter.Knight;
import character.weapon.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Axe axe;
    Axe axe2;

    @Before
    public void before(){
        axe = new Axe("Two Handed Battle", 10, 1, 100);
        axe2 = new Axe("Very old rusty", 10, 1, 100);
        knight = new Knight("Lancelot","Male",32,150, 0, axe, 100);
    }

    @Test
    public void getName(){
        assertEquals("Sir Lancelot",knight.getName());
    }

    @Test
    public void getGender(){
        assertEquals("Male", knight.getGender());
    }
    @Test
    public void getAge(){
        assertEquals(32, knight.getAge());
    }

    @Test
    public void canChangeHealthPoints() {
        knight.setHealthPoints(10);
        assertEquals(10, knight.getHealthPoints());
    }

    @Test
    public void canChangePowerPoints() {
        knight.setPowerPoints(90);
        assertEquals(90, knight.getPowerPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals("Two Handed Battle Axe", knight.getEquipment().getName());
    }

    @Test
    public void canChangeTreasure() {
        knight.setTotalTreasureValue(1000);
        assertEquals(1000, knight.getTotalTreasureValue());
    }

    @Test
    public void canSwingWeapon() {
        assertEquals("For the honor of the kingdom you strike your enemy with your Two Handed Battle Axe", knight.swingWeapon());
    }

    @Test
    public void canDefend() {
        assertEquals("With your mighty shield you force back the enemy",knight.defend());
    }

    @Test
    public void canCharge() {
        assertEquals("For the good of the King you charge forth!",knight.charge());
    }

    @Test
    public void canChangeWeapon() {
        assertEquals("Two Handed Battle Axe", knight.getEquipment().getName());
        knight.changeWeapon(axe2);
        assertEquals("Very old rusty Axe", knight.getEquipment().getName());
    }
}
