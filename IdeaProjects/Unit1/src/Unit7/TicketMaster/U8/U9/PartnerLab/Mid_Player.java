package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Mid_Player extends Player{
    private int midRange;
    private int midRangeScored;
    private int layup;

    public Mid_Player(String name, String team){
        super(name, team, (int)(Math.random()*40 + 60), (int)(Math.random()*30 + 30), 0);
        midRange = (int)(Math.random() * 30) + 40;;
        layup =  (int)(Math.random() * 20) + 80;

    }

    /**
     * Simulates shooting a shot from mid range using a combination of the player's shot % and a random chance variable
     * @return A boolean indicating if the shot was made
     */
    @Override
    public boolean midRange(){
        int shotPt = (((int)(Math.random() * 100))/100) * midRange;
        if(shotPt > 65){
            midRangeScored++;
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Simulates scoring a layup using a combination of the player's shot % and a random chance variable
     * @return A boolean indicating if the layup was made
     */
    @Override
    public boolean layup(Player player){
        int random = (int)(Math.random() * 100);
        if(getSpeed() > player.getSpeed() || (random/100 * layup) > 80){
            if(layup > 20){
                return true;
            }
            return false;
        }
        return false;
    }
    public String toString(){
        String output = super.toString();
        output += "Mid Range %: " + midRange + "\n";
        output += "Layup %: " + layup + "\n";
        output += "This player has scored " + midRangeScored +" mid range shots, and has scored " + getPoints() + " points." + "\n";
        return output;
    }

    public int getMidRange() {
        return midRange;
    }

    public void setMidRange(int midRange) {
        this.midRange = midRange;
    }

    public int getMidRangeScored() {
        return midRangeScored;
    }

    public void setMidRangeScored(int midRangeScored) {
        this.midRangeScored = midRangeScored;
    }

    public int getLayup() {
        return layup;
    }

    public void setLayup(int layup) {
        this.layup = layup;
    }
}
