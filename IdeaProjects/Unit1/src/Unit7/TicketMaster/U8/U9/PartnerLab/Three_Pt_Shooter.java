package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Three_Pt_Shooter extends Player{
    private int threePt;
    private int threePtScored = 0;
    private int handles;

    public Three_Pt_Shooter(String name, String team){
        super(name, team, (int)(Math.random()*40 + 60), (int)(Math.random()*30 + 30), 0);
        threePt = (int)(Math.random() * 40) + 60;
        handles = (int)(Math.random() * 30) + 70;
    }

    /**
     * Simulates shooting a three pointer, using the player's three point percentage with a random chance variable
     */
    @Override
    public void shootThree(){
        int shotPt = (int) (Math.random() * 100) * threePt;
        if (shotPt > 65) {
            threePtScored++;
        }
    }


    public String toString(){
        String output = super.toString();
        output += "Handles: " + handles + "\n";
        output += "Three Point %: " + threePt + "\n";
        output += "This player has scored " + threePtScored +" three pointers, and has " + handles + " ball handles." + "\n";
        return output;
    }

    public int getThreePt() {
        return threePt;
    }

    public void setThreePt(int threePt) {
        this.threePt = threePt;
    }

    public int getThreePtScored() {
        return threePtScored;
    }

    public void setThreePtScored(int threePtScored) {
        this.threePtScored = threePtScored;
    }

    public int getHandles() {
        return handles;
    }

    public void setHandles(int handles) {
        this.handles = handles;
    }
}
