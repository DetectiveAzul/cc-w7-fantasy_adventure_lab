package character.weapon;

public class Axe extends Weapon {
    public Axe(String name, int damage, int range, int durability ) {
        super(name, damage, range, durability);
        this.name = name + " Axe";
    }

}
