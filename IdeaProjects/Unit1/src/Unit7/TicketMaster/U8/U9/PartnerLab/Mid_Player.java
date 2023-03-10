package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Mid_Player extends Player{
    //jumpShot
    //layup (thisPlayer speed > otherPlayer speed)
    //closeShot
    private int midRange;
    private int midRangeScored;
    private int layup;
    private int handles;
    public Mid_Player(String name, String team, int speed, int strength, int m, int l, int h){
        super(name, team, speed, strength);
        midRange = m;
        layup = l;
        handles = h;
    }
    public void midRange(){
        int shotPt = (((int)(Math.random() * 100))/100) * midRange;
        if(shotPt > 65){
            midRangeScored++;
            System.out.println("Scored Mid Range");
        }
    }
    public void layup(Mid_Player player){
        int random = (int)(Math.random() * 100);
        if(getSpeed() > player.getSpeed() || (random/100 * layup) > 80){
            if(layup > 20){
                System.out.println("Scored layup");
            }
        }
    }

    public String displayStats(){
        String output = super.displayStats();
        output += "Mid Range %: " + midRange;
        output += "Layup %: " + layup;
        output += "This player has scored " + midRangeScored +" three pointers, and has " + handles + " ball handles.";
        return output;
    }

    public int getMidRange() {
        return midRange;
    }
}
