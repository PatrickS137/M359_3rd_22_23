package Unit5.notes.HeroVillainExample;

public class Villain {
    private String villainName;
    private Power villainPower;

    public Villain (String villainName, Power villainPower) {
        this.villainName = villainName;
        this.villainPower = villainPower;
        //this copies the reference to an already created power object
    }

    public Villain (String villainName, String powerName, int powerStrength) {
        this.villainName = villainName;
        this.villainPower = new Power (powerName, powerStrength);
        //here we create a new power object with the passed in name and strength
    }

    public String toString() {
        String str = "This Super villain is named: " + villainName + "\n";
        str +=villainPower.toString();//calls toString and adds the returned
        //String from power class to this string we are building
        //up here inside the supervillain class
        return str;
    }

    public void updateStrengthAfterBattle(double percent){
        villainPower.setPowerStrength((int)(percent * villainPower.getPowerStrength()));
    }

    public String getvillainName() {
        return villainName;
    }

    public void setvillainName(String villainName) {
        this.villainName = villainName;
    }

    public Power getvillainPower() {
        return villainPower;
    }

    public void setvillainPower(Power villainPower) {
        this.villainPower = villainPower;
    }
}
