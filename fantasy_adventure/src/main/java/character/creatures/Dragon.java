package character.creatures;

public class Dragon extends MythicalCreature {

    public Dragon(String name, String species, String size) {
        super(name, species, size);
    }

    public String ride() {
        return "Your Dragon spread its wings and flies over the clouds";
    }
}
