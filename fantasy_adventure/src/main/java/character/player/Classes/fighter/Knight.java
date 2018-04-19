package character.player.Classes.fighter;

import character.player.Equipment;
import character.player.Player;

public class Knight extends Player implements Fighter {

    public Knight(String name, String gender, int age, int healthPoints, int powerPoints, Equipment equipment, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, equipment, totalTreasureValue);
        this.name = "Sir " + name;
    }

    public String swingWeapon() {
        return "For the honor of the kingdom you strike your enemy with your " + getEquipment().getName();
    }
    public String defend() {
        return "With your mighty shield you force back the enemy";
    }
    public String charge() {
        return "For the good of the King you charge forth!";
    }
    public void changeWeapon(Equipment equipment) {
        setEquipment(equipment);
    }
}
