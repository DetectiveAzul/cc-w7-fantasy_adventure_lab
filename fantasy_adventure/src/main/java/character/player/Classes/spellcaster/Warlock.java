package character.player.Classes.spellcaster;

import character.creatures.MythicalCreature;
import character.player.Player;
import character.spell.Spell;

public class Warlock extends Player implements SpellCaster {
    private MythicalCreature ride;

    public Warlock(String name, String gender, int age, int healthPoints, int powerPoints, Spell spell, MythicalCreature ride, int totalTreasureValue) {
    super(name,gender,age,healthPoints,powerPoints,spell,totalTreasureValue);
    this.ride = ride;
    }

    public String rideMount(){
        return ride.ride();
    }

    public void changeMount(MythicalCreature ride){
        this.ride = ride;
    }

    public String meditate(){
        return "You clear your mind and recover your mana";
    }

    public String castSpell(){
        Spell spell = (Spell) getEquipment();
        return "You cast " + getEquipment().getName() + " costing " + spell.getMana();
    }

    public void studyNewSpell(Spell spell){
        setEquipment(spell);
    }
}
