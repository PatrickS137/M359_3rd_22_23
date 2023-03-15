package Unit7.TicketMaster.U8.U9.PartnerLab;

import java.util.Scanner;

public class SimsGame {
    public static void main(String[] args) {
        /*
        Enter player 1's name

        Enter player 2's name

        <player1> enter the name of your 3pt shooter

        <player2> enter the name of your 3pt shooter

        <player1> enter the name of your mid range player

        <player2> enter the name of your mid range player

        <player1> enter the name of your defense player

        <player2> enter the name of your defense player
        */
        int p1Points = 0;
        int p2Points = 0;

        String showCommands = "";
        showCommands+=  "|- ---------------------- -|";
        showCommands+="\n|=   COMMANDS";
        showCommands+="\n|=   0 for Commands";
        showCommands+="\n|=   1 for 3 Pointer";
        showCommands+="\n|=   2 for Layup";
        showCommands+="\n|=   3 for Mid range";
        showCommands+="\n|=   4 to quit";
        showCommands+="\n|- ---------------------- -|";

        System.out.println(showCommands);



        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Player 1, enter your team name");
            String p1_team = s.nextLine();
            System.out.println("Player 1, enter the statistics of your players");
            System.out.println("Speed: ");
            int p1_speed = s.nextInt();
            System.out.println("Strength: ");
            int p1_strength = s.nextInt();
            s.nextLine();
            System.out.println("Player 1, enter the name of your Three-Point Shooter");
            String p1_3pt_name = s.nextLine();
            System.out.println("Three Point Percentage: ");
            int p1_3pt_pct = s.nextInt();
            System.out.println("Handles: ");
            int p1_3pt_handles = s.nextInt();
            s.nextLine();
            System.out.println("Player 1, enter the name of your Mid-Range Player");
            String p1_mid_Name = s.nextLine();
            System.out.println("Mid Range Percentage: ");
            int p1_mid_pct = s.nextInt();
            System.out.println("Layup Percentage: ");
            int p1_layup_pct = s.nextInt();
            s.nextLine();
            System.out.println("Player 1, enter the name of your Defensive Player");
            String p1_def_Name = s.nextLine();
            System.out.println("Block Percentage: ");
            int p1_def_block = s.nextInt();
            Three_Pt_Shooter p1_3pt = new Three_Pt_Shooter(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_3pt_pct, p1_3pt_handles);
            Mid_Player p1_mid = new Mid_Player(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_mid_pct, p1_layup_pct);
            Defense_Guy p1_def = new Defense_Guy(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_def_block);
            System.out.println("Player 1's team created");

        String player1Stats = "";
        player1Stats+=  "|- --------------------------------- -|";
        player1Stats+="\n|= Player 1";
        player1Stats+="\n|= Name: " + p1_team;
        player1Stats+="\n|= Sped: " + p1_speed;
        player1Stats+="\n|= Strength: " + p1_strength;
        player1Stats+="\n|= 3 point player: ";
        player1Stats+="\n|= \t Name: " + p1_3pt_name;
        player1Stats+="\n|= \t Percent: " + p1_3pt_pct;
        player1Stats+="\n|= \t Handles: " + p1_3pt_handles;
        player1Stats+="\n|= Mid range player: " ;
        player1Stats+="\n|= \t Name: " + p1_mid_Name;
        player1Stats+="\n|= \t Percent: " + p1_mid_pct;
        player1Stats+="\n|= \t Layups: " + p1_layup_pct;
        player1Stats+="\n|= Defensive player: ";
        player1Stats+="\n|= \t Name: " + p1_def_Name;
        player1Stats+="\n|= \t Blocks: " + p1_def_block;
        player1Stats+="\n|- --------------------------------- -|";

        System.out.println(player1Stats);
        }catch (Error e){
            System.out.println("Please enter valid input!");
        }


        try {
            System.out.println("Player 2, enter your team name");
            String p2_team = s.nextLine();
            System.out.println("Player 2, enter the statistics of your players");
            System.out.println("Speed: ");
            int p2_speed = s.nextInt();
            System.out.println("Strength: ");
            int p2_strength = s.nextInt();
            s.nextLine();
            System.out.println("Player 2, enter the name of your Three-Point Shooter");
            String p2_3pt_name = s.nextLine();
            System.out.println("Three Point Percentage: ");
            int p2_3pt_pct = s.nextInt();
            System.out.println("Handles: ");
            int p2_3pt_handles = s.nextInt();
            s.nextLine();
            System.out.println("Player 2, enter the name of your Mid-Range Player");
            String p2_mid_Name = s.nextLine();
            System.out.println("Mid Range Percentage: ");
            int p2_mid_pct = s.nextInt();
            System.out.println("Layup Percentage: ");
            int p2_layup_pct = s.nextInt();
            s.nextLine();
            System.out.println("Player 2, enter the name of your Defensive Player");
            String p2_def_Name = s.nextLine();
            System.out.println("Block Percentage: ");
            int p2_def_block = s.nextInt();
            Three_Pt_Shooter p2_3pt = new Three_Pt_Shooter(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_3pt_pct, p2_3pt_handles);
            Mid_Player p2_mid = new Mid_Player(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_mid_pct, p2_layup_pct);
            Defense_Guy p2_def = new Defense_Guy(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_def_block);
            System.out.println("Player 2's team created");

        String player2Stats = "";
        player2Stats+=  "|- --------------------------------- -|";
        player2Stats+="\n|= Player 2";
        player2Stats+="\n|= Name: " + p2_team;
        player2Stats+="\n|= Sped: " + p2_speed;
        player2Stats+="\n|= Strength: " + p2_strength;
        player2Stats+="\n|= 3 point player: ";
        player2Stats+="\n|= \t Name: " + p2_3pt_name;
        player2Stats+="\n|= \t Percent: " + p2_3pt_pct;
        player2Stats+="\n|= \t Handles: " + p2_3pt_handles;
        player2Stats+="\n|= Mid range player: " ;
        player2Stats+="\n|= \t Name: " + p2_mid_Name;
        player2Stats+="\n|= \t Percent: " + p2_mid_pct;
        player2Stats+="\n|= \t Layups: " + p2_layup_pct;
        player2Stats+="\n|= Defensive player: ";
        player2Stats+="\n|= \t Name: " + p2_def_Name;
        player2Stats+="\n|= \t Blocks: " + p2_def_block;
        player2Stats+="\n|- --------------------------------- -|";

        System.out.println(player1Stats);
        }catch (Error e){
            System.out.println("Please enter valid input");
        }


        System.out.println("ruUHDVAHJKLSGFEUHYSDVnning");

        boolean flag = true;
        boolean player1turn = false;
        int num = 1;
        System.out.println("type 0 to show instructions again");
        System.out.println(showCommands);
        while (flag) {
            player1turn = !player1turn;
            if(player1turn) {
                if (p2_def.steal()) player1turn = false;
            }
            else {
                if (p1_def.steal()) player1turn = true;
            }
            int choice;
            System.out.println("Enter number here...");
            try{
                choice = s.nextInt();
//--------------------------------------------------------------------------------------------
                if (choice <0|| choice >6){
                    System.out.println("Please type an integer 1-6 (or 0 to show instructions)");
                    s.nextLine();
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 0){
                    System.out.println(showCommands);
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 1) {
                    if (player1turn) {
                        System.out.println(p1_3pt_name + " shoots a three!");
                        p1_3pt.shootThree(100);
                        if (p2_def.blocks(p1_3pt)) {
                            System.out.println("Blocked!");
                        } else {
                            System.out.println("It's good!");
                            p1Points += 3;
                        }
                    } else {
                        System.out.println(p2_3pt_name + " shoots a three!");
                        p2_3pt.shootThree(100);
                        if (p1_def.blocks(p2_3pt)) {
                            System.out.println("Blocked!");
                        } else {
                            System.out.println("It's good!");
                            p2Points += 3;
                        }
                    }
//--------------------------------------------------------------------------------------------
                }else if (choice == 2){
                    System.out.println("Layup");
                    if (player1turn) {
                        System.out.println(p1_mid_Name + " on the " + p1_team + " attempts a layup!");
                        if (p1_mid.layup(p2_mid)){
                            System.out.println("Aaaaand " + p1_mid_Name + "successfully makes the layup!");
                        }
                        else {
                            System.out.println("Aaaaand " + p1_mid_Name + "misses the layup!");
                        }

                    }
                    else {
                        System.out.println(p2_mid_Name + " on the " + p2_team + " attempts a layup!");
                        if (p2_mid.layup(p1_mid)){
                            System.out.println("Aaaaand " + p2_mid_Name + "successfully makes the layup!");
                        }
                        else {
                            System.out.println("Aaaaand " + p2_mid_Name + "misses the layup!");
                        }
                    }
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 3) {
                    if(player1turn){
                        System.out.println(p1_mid_Name + " shoots from Mid-Range!");
                        p1_mid.midRange();
                        if(p2_def.blocks(p1_mid)){
                            System.out.println("Blocked!");
                        }else {
                            System.out.println("It's good!");
                            p1Points += 2;
                        }
                    }else{
                        System.out.println(p2_mid_Name + " shoots a three!");
                        p2_mid.midRange();
                        if(p1_def.blocks(p2_mid)){
                            System.out.println("Blocked!");
                        }else {
                            System.out.println("It's good!");
                            p2Points += 2;
                        }
                    }
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 4){
                    System.out.println("getting toaster ready...");
                    s.close();
                    flag = false;
                }
//--------------------------------------------------------------------------------------------
            }
            catch (Exception e){

                System.out.println("Please type an integer 1-6 (or 0 to show instructions)");
                s.nextLine();
            }
        }
    }

}
