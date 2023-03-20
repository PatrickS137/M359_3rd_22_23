package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Defense_Guy extends Player{
    private int blockChance;
    private int blocks;
    private int steals;
    public Defense_Guy(String name, String team){
        super(name, team,  (int)(Math.random()*40 + 60), (int)(Math.random()*60 + 40), 0);
        blockChance = (int)(Math.random() * 20) + 30;
        steals = 0;
    }

    /**
     * Simulates stealing the ball from the other team; Both teams have a 25% chance of stealing the ball
     * @return Returns a boolean indicating if the ball was stolen
     */
    @Override
    public boolean steal(){
        int stealChance = (int)(Math.random() * 100) ;
        if(stealChance>75){
            steals ++;
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Simulates blocking a player's shot: If the player's shot percentage is lower than the defensive player's block percentage,
     * the shot will be blocked. Otherwise, the defensivr player has a 30% chance to block the shot.
     * @param pl The player taking the shot
     * @return A boolean indicating if the shot was blocked
     */
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
        output += "Blocks: " + blocks + "\n";
        output += "Steals: " + steals + "\n";
        output += "This player has scored " + "0" + " three pointers, because they are defense" + "\n";
        return output;
    }

    public int getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(int blockChance) {
        this.blockChance = blockChance;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getSteals() {
        return steals;
    }

    public void setSteals(int steals) {
        this.steals = steals;
    }
}
