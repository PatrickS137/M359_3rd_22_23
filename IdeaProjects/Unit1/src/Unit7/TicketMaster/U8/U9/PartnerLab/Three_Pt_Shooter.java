package Unit7.TicketMaster.U8.U9.PartnerLab;

public class Three_Pt_Shooter extends Player{
    //buzzer beater
    //shoot
    private int threePt;
    private int threePtScored = 0;
    private int handles;
    public Three_Pt_Shooter(String name, String team, int speed, int strength, int t, int h){
        super(name, team, speed, strength, 0);
        threePt = t;
        handles = h;
    }
    public void shootThree(double timeLeft){
        if(timeLeft < 0){
            buzzerBeater();
        }
        else {
            int shotPt = (int) (Math.random() * 100) * threePt;
            if (shotPt > 65) {
                threePtScored++;
                System.out.println("Scored Three Pointer");
            }
        }
    }

    public void buzzerBeater(){
        int shotPt = (int) (Math.random() * 100) * threePt;
        if (shotPt > 85) {
            threePtScored++;
            System.out.println("Scored Buzzer Beater Three Pointer");
        }
        else{
            System.out.println("And the game ends");
        }
    }


    public String toString(){
        String output = super.toString();
        output += "Handles: " + handles;
        output += "Three Point %: " + threePt;
        output += "This player has scored " + threePtScored +" three pointers, and has " + handles + " ball handles.";
        return output;
    }
}
