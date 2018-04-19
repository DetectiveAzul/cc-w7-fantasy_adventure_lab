package character.creatures;

public class Unicorn extends MythicalCreature {

    public Unicorn(String name, String species, String size) {
        super(name, species, size);
    }

    public String ride() {
        return "Your Unicorn runs over the land as fast as the wind";
    }
}
