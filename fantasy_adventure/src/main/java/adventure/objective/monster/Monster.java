package adventure.objective.monster;

import adventure.objective.IRoomable;

public class Monster implements IRoomable {
    private String name;
    private int hp;
    private int attackDamage;
    private int attackResistance;
    private int value;
    boolean isDead;

    public Monster(String name, int hp, int attackDamage, int attackResistance, int value) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.attackResistance = attackResistance;
        this.isDead = false;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getAttackResistance() {
        return attackResistance;
    }

    public boolean isDead() {
        return isDead;
    }

    public void monsterKilled() {
        this.isDead = true;
    }

    public int getValue() {
        return value;
    }

    public void clear() {
        monsterKilled();
    }

    public boolean isDone() {
        return isDead;
    }
}
