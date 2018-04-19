import adventure.objective.monster.Monster;
import adventure.objective.treasure.Treasure;
import adventure.room.MonsterRoom;
import adventure.room.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {
    private TreasureRoom treasureRoom;
    private MonsterRoom monsterRoom;
    private Monster monster;
    private Treasure treasure;

    @Before
    public void before() {
        monster = new Monster("Grigthor", 30,20,45, 100);
        treasure = new Treasure("Chest full of gold", 100);
        monsterRoom = new MonsterRoom("Dungeons", "Monster Room", "A dirty Dungeon", monster);
        treasureRoom = new TreasureRoom("Bank", "Treasure Room", "A room full of chests", treasure);
    }

    @Test
    public void getName(){
        assertEquals("Dungeons",monsterRoom.getName());
    }

    @Test
    public void hasDescription() {
        assertEquals("A room full of chests", treasureRoom.getDescription());
    }

    @Test
    public void hasType() {
        assertEquals("Monster Room", monsterRoom.getType());
    }

    @Test
    public void getObjective(){
        assertEquals("Grigthor",monsterRoom.getObjective().getName());
    }

    @Test
    public void canBeCompleted(){
        monsterRoom.completeRoom();
        Monster monsterStatus = (Monster) monsterRoom.getObjective();
        assertTrue(monsterStatus.isDead());
        assertTrue(monsterRoom.isComplete());
    }
}
