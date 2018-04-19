package character.player.Classes.fighter;

import character.player.Equipment;
import character.player.Player;

public class Barbarian extends Player implements Fighter {
    public Barbarian(String name, String gender, int age, int healthPoints, int powerPoints, Equipment equipment, int totalTreasureValue) {
        super(name, gender, age, healthPoints, powerPoints, equipment, totalTreasureValue);
    }

    public String swingWeapon() {
        return "You scream while you hold your " + getEquipment().getName() + " over your head before striking";
    }
    public String defend() {
        return "You kick your enemies far from you";
    }
    public String charge() {
        return "You jump fiercely towards your enemy";
    }
    public void changeWeapon(Equipment equipment) {
        setEquipment(equipment);
    }
}
