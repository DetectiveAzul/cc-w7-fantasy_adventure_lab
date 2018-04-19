package character.player.Classes.fighter;

import character.player.Equipment;
import character.player.Player;
import character.weapon.Weapon;

public class Dwarf extends Player implements Fighter {
    public Dwarf(String name, String gender, int age, int healthPoints, int powerPoints, Weapon weapon, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, weapon, totalTreasureValue);
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
    public void changeWeapon(Weapon weapon) {
        setEquipment(weapon);
    }
}
