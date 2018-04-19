package adventure.objective.treasure;

import adventure.objective.IRoomable;

public class Treasure implements IRoomable {
    private String name;
    private int value;
    private boolean hasBeenFound;

    public Treasure(String name, int value) {
        this.name = name;
        this.value = value;
        this.hasBeenFound = false;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public boolean isHasBeenFound() {
        return hasBeenFound;
    }

    public void treasureFound() {
        this.hasBeenFound = true;
    }

    public void clear() {
        treasureFound();
    }

    public boolean isDone() {
        return hasBeenFound;
    }


}
