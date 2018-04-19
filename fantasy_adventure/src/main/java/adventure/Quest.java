package adventure;

import adventure.room.Room;
import character.player.Player;

import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> dungeon;
    private ArrayList<Player> party;
    private boolean dungeonCleared;
    private int location;

    public Quest(ArrayList<Room> dungeon, ArrayList<Player> party) {
        this.dungeon = dungeon;
        this.party = party;
        dungeonCleared = false;
        location = 0;
    }

    public ArrayList<Room> getDungeon() {
        return dungeon;
    }

    public ArrayList<Player> getParty() {
        return party;
    }

    public int getLocation() {
        return location;
    }

    public boolean isRoomCompleted() {
        return dungeon.get(location).isComplete();
    }

    public void completeRoom(int location) {
        dungeon.get(location).completeRoom();
        if (location < dungeon.size() - 1)
        this.location = location + 1;
    }

    public boolean isDungeonCleared() {
        boolean result = true;
        for (Room room:dungeon
             ) {
            if (!room.isComplete()) return false;
        }
        return result;
    }
    
}
