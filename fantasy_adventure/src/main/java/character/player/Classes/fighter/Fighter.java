package character.player.Classes.fighter;

import character.player.Equipment;

public interface Fighter {
    public String swingWeapon();
    public String defend();
    public String charge();
    public void changeWeapon(Equipment equipment);
}
