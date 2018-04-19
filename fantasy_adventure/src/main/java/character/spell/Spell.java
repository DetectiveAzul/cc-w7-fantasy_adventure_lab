package character.spell;

import character.player.Equipment;

public abstract class Spell implements Equipment {
    protected String name;
    private int damage;
    private int mana;
    private int range;

    public Spell(String name, int damage, int mana, int range) {
        this.name = name;
        this.damage = damage;
        this.mana = mana;
        this.range = range;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getMana() {
        return mana;
    }

    public int getRange() {
        return range;
    }
}
