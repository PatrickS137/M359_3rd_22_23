package Unit5.notes.HeroVillainExample;

public class Power {
    private String powerName;
    private int powerStrength;

    public Power(String name, int strength) {
        this.powerName = powerName;
        this.powerStrength = powerStrength;
    }

    public String toString() {
        return "the power is: " + powerName + " with a strength of: " + powerStrength;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}