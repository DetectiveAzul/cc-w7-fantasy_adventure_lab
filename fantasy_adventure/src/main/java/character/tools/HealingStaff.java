package character.tools;

public class HealingStaff extends HealingTool {
    public HealingStaff(String name, int recovery, int range, int durability) {
        super(name, recovery, range, durability);
        this.name = name + " Healing Staff";
    }
}

