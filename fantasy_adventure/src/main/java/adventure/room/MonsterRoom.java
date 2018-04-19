package adventure.room;

import adventure.objective.monster.Monster;

public class MonsterRoom extends Room {
    public MonsterRoom(String name, String type, String description, Monster monster) {
        super(name, type, description, monster);
    }

    public String completeRoom() {
        String result = "You have defeated " + getObjective().getName() + " and gained " + getObjective().getValue() +
                " exp points.";
        getObjective().clear();
        setComplete();
        return result;
    }

}
