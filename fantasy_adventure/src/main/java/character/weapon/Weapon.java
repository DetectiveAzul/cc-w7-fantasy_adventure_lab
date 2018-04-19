package character.weapon;

import character.player.Equipment;

public abstract class Weapon implements Equipment {
    protected String name;
    private int damage;
    private int range;
    private int durability;

    public Weapon(String name, int damage, int range, int durability){
        this.name = name;
        this.damage = damage;
        this.range = range;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getRange() {
        return range;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
