import adventure.objective.monster.Monster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MonsterTest {

    Monster monster;

    @Before
    public void before(){
        monster = new Monster("Grigthor", 30,20,45, 100);
    }

    @Test
    public void getName(){
        assertEquals("Grigthor",monster.getName());
    }

    @Test
    public void getHp(){
        assertEquals(30,monster.getHp());
    }

    @Test
    public void setHp(){
        monster.setHp(10);
        assertEquals(10,monster.getHp());
    }

    @Test
    public void getAttackDamage(){
        assertEquals(20,monster.getAttackDamage());
    }

    @Test
    public void getAttackRisitsance(){
        assertEquals(45,monster.getAttackResistance());
    }

    @Test
    public void getValue(){
        assertEquals(100,monster.getValue());
    }

    @Test
    public void isDead() {
        assertFalse(monster.isDead());
        monster.monsterKilled();
        assertTrue(monster.isDead());
    }
}
