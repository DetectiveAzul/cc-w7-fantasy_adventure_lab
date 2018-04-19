package adventure.room;

import adventure.objective.treasure.Treasure;

public class TreasureRoom extends Room {
    public TreasureRoom(String name, String type, String description, Treasure treasure) {
        super(name, type, description, treasure);
    }

    public String completeRoom() {
        String result = "You have found " + getObjective().getName() + " and gained " + getObjective().getValue() +
                " gold coins";
        getObjective().clear();
        setComplete();
        return result;
    }
}
