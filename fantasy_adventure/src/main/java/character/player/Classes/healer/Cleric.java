package character.player.Classes.healer;

import character.player.Equipment;
import character.player.Player;
import character.tools.HealingTool;

public class Cleric extends Player implements Healer {
    public Cleric(String name, String gender, int age, int healthPoints, int powerPoints, Equipment equipment, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, equipment, totalTreasureValue);
    }

    public String heal() {
        HealingTool tool = (HealingTool) getEquipment();
        return "You pray and thanks to your faith, your " + getEquipment().getName() + " heals you for " + tool.getRecovery();
    }
    public void changeHealingTool(HealingTool healingTool) {
        setEquipment(healingTool);
    }
    public String checkStatus() {
        return "Your lifepoints are " + getHealthPoints();
    }
}
