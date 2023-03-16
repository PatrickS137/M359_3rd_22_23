package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Mid_Player extends Player{
    //jumpShot
    //layup (thisPlayer speed > otherPlayer speed)
    //closeShot
    private int midRange;
    private int midRangeScored;
    private int layup;
    public Mid_Player(String name, String team){
        super(name, team, (int)(Math.random()*40 + 60), (int)(Math.random()*30 + 30), 0);

        midRange = (int)(Math.random() * 30) + 40;;
        layup =  (int)(Math.random() * 20) + 80;

    }
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
        output += "Mid Range %: " + midRange;
        output += "Layup %: " + layup;
        output += "This player has scored " + midRangeScored +" mid range shots, and has scored " + getPoints() + " points.";
        return output;
    }

    public int getMidRange() {
        return midRange;
    }
}
