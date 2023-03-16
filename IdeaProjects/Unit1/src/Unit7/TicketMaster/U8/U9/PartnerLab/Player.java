package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Player {
    private String name;
    private String team;
    private int speed;
    private int strength;
    private int points;
    //name

    public Player(String name, String team, int speed, int strength, int points) {
        this.name = name;
        this.team = team;
        this.speed = speed;
        this.strength = strength;
        this.points = points;
    }


    //stats
    public String toString(){
        String output = "";
        output += "stats for "+ getName();
        output += "--------------------------------";
        output += "Speed: " + getSpeed() + "MPH";
        output += "Strength: " + getStrength()+"/100";
        return output;
    }
    //-------------------Defense
    public boolean steal(){
        return false;
    }
    public boolean blocks(Player pl){
        return false;
    }
    //-------------------3pt

    public void shootThree(){}
    //-------------------Mid player
    public boolean midRange(){
        return false;
    }
    public boolean layup(Player pl){
        return false;
    }
    //-------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPoints() {
        return points;
    }
}
