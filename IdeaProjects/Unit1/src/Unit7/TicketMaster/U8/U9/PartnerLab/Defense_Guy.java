package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Defense_Guy extends Player{
    //rebound
    //block
    //steal
    //dunk
    private int blockChance;
    private int blocks;
    private int steals;
    private int rebounds;
    public Defense_Guy(String name, String team, int speed, int strength, int b){
        super(name, team, speed, strength, 0);
        blockChance = b;
        rebounds = 0;
        steals = 0;
    }
    public void steal(){
        int stealChance = (int)(Math.random() * 100);
        int keepChance = (int)(Math.random() * 100);
        if(stealChance>keepChance){
            steals ++;
            System.out.println("The defender steals the ball!");
        }
        else{
            System.out.println("The shooter got away");
        }
    }
    public void blocks(Player pl){
        int random = (int)(Math.random() * 100);
        if(pl instanceof Mid_Player){
            if(((Mid_Player)pl).getMidRange() > blockChance && random > 70){
                System.out.println("Blocked");
            }else if(blockChance > ((Mid_Player)pl).getMidRange()){
                System.out.println("Blocked");
            }
        }
    }
    @Override
    public String toString() {
        String output = super.toString();
        output += "Blocks: " + blocks;
        output += "Steals: " + steals;
        output += "Rebounds: " + rebounds;
        output += "This player has scored " + "0" + " three pointers, because they are defense";
        return output;
    }
}
