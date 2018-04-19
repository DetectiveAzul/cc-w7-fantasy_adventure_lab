package character.player;

public abstract class Player {
    protected String name;
    private String gender;
    private int age;
    private Equipment equipment;
    private int totalTreasureValue;

    private int healthPoints;
    private int powerPoints;

    public Player(String name, String gender, int age, int healthPoints, int powerPoints, Equipment equipment, int totalTreasureValue) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.healthPoints = healthPoints;
        this.powerPoints = powerPoints;
        this.equipment = equipment;
        this.totalTreasureValue = totalTreasureValue;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getTotalTreasureValue() {
        return totalTreasureValue;
    }

    public void setTotalTreasureValue(int totalTreasureValue) {
        this.totalTreasureValue = totalTreasureValue;
    }
}
