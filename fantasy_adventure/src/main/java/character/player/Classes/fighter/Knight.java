package character.player.Classes.fighter;

import character.player.Equipment;
import character.player.Player;
import character.weapon.Weapon;

public class Knight extends Player implements Fighter {

    public Knight(String name, String gender, int age, int healthPoints, int powerPoints, Weapon weapon, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, weapon, totalTreasureValue);
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
    public void changeWeapon(Weapon weapon) {
        setEquipment(weapon);
    }
}
