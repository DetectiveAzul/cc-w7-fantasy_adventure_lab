package character.creatures;

public abstract class MythicalCreature {
    private String name;
    private String species;
    private String size;

    public MythicalCreature(String name, String species, String size) {
        this.name = name;
        this.species = species;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getSize() {
        return size;
    }

    public abstract String ride();
}
