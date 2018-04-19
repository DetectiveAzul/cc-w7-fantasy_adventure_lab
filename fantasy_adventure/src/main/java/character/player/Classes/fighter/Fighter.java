package character.player.Classes.fighter;

import character.player.Equipment;
import character.weapon.Weapon;

public interface Fighter {
    public String swingWeapon();
    public String defend();
    public String charge();
    public void changeWeapon(Weapon weapon);
}
