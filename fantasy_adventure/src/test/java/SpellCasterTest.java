import character.creatures.Dragon;
import character.creatures.Unicorn;
import character.player.Classes.spellcaster.Warlock;
import character.player.Classes.spellcaster.Wizard;
import character.spell.Fireball;
import character.spell.MagicMissile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class SpellCasterTest {

    Wizard wizard;
    Warlock warlock;
    Fireball fireball;
    MagicMissile magicMissile;
    Dragon dragon;
    Unicorn unicorn;

    @Before
    public void before(){
        fireball = new Fireball("Fireball", 10, 1, 100);
        magicMissile = new MagicMissile("Magic Missile", 8, 5, 90);
        dragon = new Dragon("Smaug","Dragon","Large");
        unicorn = new Unicorn("Pointy","Unicorn","medium");
        wizard = new Wizard("Gandalf","Male", 4000,100,140,fireball,unicorn,0);
        warlock = new Warlock("Dumbledore","Male", 150,90,200,magicMissile,dragon,10);


    }

    @Test
    public void canMount() {
        assertEquals("Your Unicorn runs over the land as fast as the wind",wizard.rideMount());
    }

    @Test
    public void canSwapSpell() {
        warlock.studyNewSpell(fireball);
        assertEquals("Fireball", warlock.getEquipment().getName());
    }

    @Test
    public void changeMount() {
        wizard.changeMount(unicorn);
        assertEquals("Your Unicorn runs over the land as fast as the wind",unicorn.ride());
    }

    @Test
    public void canMeditate() {
        assertEquals("You summon your magics to regain your mana", wizard.meditate());
        assertEquals("You clear your mind and recover your mana", warlock.meditate());
    }

    @Test
    public void canCast() {
        assertEquals("You read Fireball from your book, costing 1", wizard.castSpell());
        assertEquals("You cast Magic Missile costing 5", warlock.castSpell());
    }



}
