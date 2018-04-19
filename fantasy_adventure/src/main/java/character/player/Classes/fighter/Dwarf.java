package character.player.Classes.fighter;

import character.player.Equipment;
import character.player.Player;

public class Dwarf extends Player implements Fighter {
    public Dwarf(String name, String gender, int age, int healthPoints, int powerPoints, Equipment equipment, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, equipment, totalTreasureValue);
    }

    public String swingWeapon() {
        return "You swing your " + getEquipment().getName() + " with Dwarf bravery";
    }
    public String defend() {
        return "You stood defensively against every foe";
    }
    public String charge() {
        return "You shout a Dwarvish Swear before rushing against your enemy";
    }
    public void changeWeapon(Equipment equipment) {
        setEquipment(equipment);
    }
}
