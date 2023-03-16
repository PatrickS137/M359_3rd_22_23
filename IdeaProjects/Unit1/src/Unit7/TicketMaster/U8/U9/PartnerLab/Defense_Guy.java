package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Defense_Guy extends Player{
    //rebound
    //block
    //steal
    //dunk
    private int blockChance;
    private int blocks;
    private int steals;
    public Defense_Guy(String name, String team){
        super(name, team,  (int)(Math.random()*40 + 60), (int)(Math.random()*60 + 40), 0);
        blockChance = (int)(Math.random() * 20) + 30;
        steals = 0;
    }
    @Override
    public boolean steal(){
        int stealChance = (int)(Math.random() * 100);
        int keepChance = (int)(Math.random() * 100);
        if(stealChance>keepChance){
            steals ++;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean blocks(Player pl){
        int random = (int)(Math.random() * 100);
        if(pl instanceof Mid_Player){
            if(blockChance > ((Mid_Player)pl).getMidRange()){
                return true;
            }else if(random > 70){
                return true;
            }
        } else if(pl instanceof Three_Pt_Shooter){
            if(blockChance > ((Three_Pt_Shooter)pl).getThreePt()){
                return true;
            }else if(random > 70){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        String output = super.toString();
        output += "Blocks: " + blocks;
        output += "Steals: " + steals;
        output += "This player has scored " + "0" + " three pointers, because they are defense";
        return output;
    }
}
