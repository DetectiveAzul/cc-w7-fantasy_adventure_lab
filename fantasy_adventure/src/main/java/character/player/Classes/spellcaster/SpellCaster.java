package character.player.Classes.spellcaster;

import character.spell.Spell;

public interface SpellCaster {
    public String rideMount();
    public String meditate();
    public String castSpell();
    public void studyNewSpell(Spell spell);
}
