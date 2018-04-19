package character.tools;

public class HealingPotion extends HealingTool {
    public HealingPotion(String name, int recovery, int range, int durability) {
        super(name, recovery, range, durability);
        this.name = name + " Healing Potion";
    }
}
