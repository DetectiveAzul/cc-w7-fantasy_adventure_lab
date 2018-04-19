package character.tools;

import character.player.Equipment;

public abstract class HealingTool implements Equipment {
    protected String name;
    private int recovery;
    private int range;
    private int durability;

    public HealingTool(String name, int recovery, int range, int durability) {
        this.name = name;
        this.recovery = recovery;
        this.range = range;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getRecovery() {
        return recovery;
    }

    public int getRange() {
        return range;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
