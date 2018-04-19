package character.player.Classes.spellcaster;

import character.creatures.MythicalCreature;
import character.player.Player;
import character.spell.Spell;

public class Wizard extends Player implements SpellCaster {
    private MythicalCreature ride;

    public Wizard(String name, String gender, int age, int healthPoints, int powerPoints, Spell spell, MythicalCreature ride, int totalTreasureValue) {
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
        return "You summon your magics to regain your mana";
    }

    public String castSpell(){
        Spell spell = (Spell) getEquipment();
        return "You read " + getEquipment().getName() + " from your book, costing " + spell.getMana();
    }

    public void studyNewSpell(Spell spell){
        setEquipment(spell);
    }
}
