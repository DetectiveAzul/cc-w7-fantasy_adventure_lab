import character.spell.Fireball;
import character.spell.MagicMissile;
import character.weapon.Axe;
import character.weapon.Hammer;
import character.weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {
    private Fireball fireball;
    private MagicMissile magicMissile;
    @Before
    public void before() {
        fireball = new Fireball("Fireball", 10, 1, 100);
        magicMissile = new MagicMissile("Magic Missile", 8, 5, 90);
    }

    @Test
    public void hasName() {
        assertEquals("Fireball", fireball.getName());
    }

    @Test
    public void hasDamge() {
        assertEquals(10, fireball.getDamage());
    }

    @Test
    public void hasRange() {
        assertEquals(90, magicMissile.getRange());
    }

    @Test
    public void hasMana() {
        assertEquals(5, magicMissile.getMana());
    }
}
