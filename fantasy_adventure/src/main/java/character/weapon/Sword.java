package character.weapon;

public class Sword extends Weapon {
    public Sword(String name, int damage, int range, int durability ) {
        super(name, damage, range, durability);
        this.name = name + " Sword";
    }
}
