package adventure.room;

import adventure.objective.IRoomable;

public abstract class Room {
    private String name;
    private String type;
    private String description;
    private IRoomable objective;
    private boolean isComplete;

    public Room(String name, String type, String description, IRoomable objective) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.objective = objective;
        isComplete = false;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public IRoomable getObjective() {
        return objective;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete() {
        isComplete = true;
    }

    public abstract String completeRoom();



}
