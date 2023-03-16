package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Three_Pt_Shooter extends Player{
    //buzzer beater
    //shoot
    private int threePt;
    private int threePtScored = 0;
    private int handles;
    public Three_Pt_Shooter(String name, String team){
        super(name, team, (int)(Math.random()*40 + 60), (int)(Math.random()*30 + 30), 0);
        threePt = (int)(Math.random() * 40) + 60;
        handles = (int)(Math.random() * 30) + 70;
    }
    @Override
    public void shootThree(){
        int shotPt = (int) (Math.random() * 100) * threePt;
        if (shotPt > 65) {
            threePtScored++;
        }
    }


    public String toString(){
        String output = super.toString();
        output += "Handles: " + handles;
        output += "Three Point %: " + threePt;
        output += "This player has scored " + threePtScored +" three pointers, and has " + handles + " ball handles.";
        return output;
    }

    public int getThreePt() {
        return threePt;
    }
}
