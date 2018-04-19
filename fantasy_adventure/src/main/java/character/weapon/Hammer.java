package character.weapon;

public class Hammer extends Weapon {
    public Hammer(String name, int damage, int range, int durability ) {
        super(name, damage, range, durability);
        this.name = name + " Hammer";
    }

}
