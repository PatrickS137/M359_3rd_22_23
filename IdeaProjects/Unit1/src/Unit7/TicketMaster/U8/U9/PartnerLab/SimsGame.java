package Unit7.TicketMaster.U8.U9.PartnerLab;

import java.util.Scanner;

public class SimsGame {
    public static void main(String[] args) {
        int p1Points = 0;
        int p2Points = 0;
        Player[] p1Players = new Player[3];
        Player[] p2Players = new Player[3];

        String showCommands = "";
        showCommands+=  "|- ---------------------- -|";
        showCommands+="\n|=   COMMANDS";
        showCommands+="\n|=   0 for Commands";
        showCommands+="\n|=   1 for 3 Pointer";
        showCommands+="\n|=   2 for Layup";
        showCommands+="\n|=   3 for Mid range";
        showCommands+="\n|=   4 to show stats";
        showCommands+="\n|=   5 to quit";
        showCommands+="\n|- ---------------------- -|";


        System.out.println("Welcome to the Court!\n");

        Scanner s = new Scanner(System.in);

        System.out.println("Player 1, enter your team name");
        String p1_team = s.nextLine();
        System.out.println("Player 1, enter the name of your Three-Point Shooter");
        String p1_3pt_name = s.nextLine();
        System.out.println("Player 1, enter the name of your Mid-Range Player");
        String p1_mid_Name = s.nextLine();
        System.out.println("Player 1, enter the name of your Defensive Player");
        String p1_def_Name = s.nextLine();


        p1Players[0] = new Three_Pt_Shooter(p1_3pt_name, p1_team);
        p1Players[1] = new Mid_Player(p1_mid_Name, p1_team);
        p1Players[2] = new Defense_Guy(p1_def_Name, p1_team);
        System.out.println("Player 1's team created");


        System.out.println("Player 2, enter your team name");
        String p2_team = s.nextLine();
        System.out.println("Player 2, enter the name of your Three-Point Shooter");
        String p2_3pt_name = s.nextLine();
        System.out.println("Player 2, enter the name of your Mid-Range Player");
        String p2_mid_Name = s.nextLine();
        System.out.println("Player 2, enter the name of your Defensive Player");
        String p2_def_Name = s.nextLine();


        p2Players[0] = new Three_Pt_Shooter(p2_3pt_name, p2_team);
        p2Players[1] = new Mid_Player(p2_3pt_name, p2_team);
        p2Players[2] = new Defense_Guy(p2_def_Name, p2_team);
        System.out.println("Player 2's team created");


        boolean flag = true;
        boolean player1turn = false;
        System.out.println(showCommands);

        int choice = 0;
        while (flag) {
            player1turn = !player1turn;
            if(player1turn) {
                System.out.println(p1_team + "'s turn!\n");
                if (choice != 0 && p2Players[2].steal()) {
                    player1turn = false;
                    System.out.println("The " + p2_team + " have stolen the ball!");
                    System.out.println("Turnover!");
                };
            } else {
                System.out.println(p2_team + "'s turn!\n");
                if (choice != 0 && p1Players[2].steal()) {
                    player1turn = true;
                    System.out.println("The " + p1_team + " have stolen the ball!");
                    System.out.println("Turnover!");
                }
            }
            String currentPlayer = player1turn ? "Player 1" : "Player 2";

            System.out.println("\n" + currentPlayer + " enter a command here...");
            try{
                choice = s.nextInt();

//--------------------------------------------------------------------------------------------
                if (choice <0|| choice >6){
                    System.out.println("Please type an integer 1-5 (or 0 to show instructions)");
                    s.nextLine();
                    player1turn = !player1turn;
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 0){
                    System.out.println(showCommands);
                    player1turn = !player1turn;
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 1) {
                    if (player1turn) {
                        System.out.println(p1_3pt_name + " attempts a three point shot!\n...");
                        p1Players[0].shootThree();
                        if (p2Players[2].blocks(p1Players[0])) {
                            System.out.println("Aaaaand " + p1_3pt_name + " gets a smackdown by the defender!");
                        } else {
                            System.out.println("Aaaaand " + p1_3pt_name + " makes the shot from the three point line!");
                            p1Points += 3;
                        }
                    } else {
                        System.out.println(p2_3pt_name + " attempts a three point shot!\n...");
                        p2Players[0].shootThree();
                        if (p1Players[0].blocks(p2Players[0])) {
                            System.out.println("Aaaaand " + p1_3pt_name + " shoots the ball into the defender's hands!");
                        } else {
                            System.out.println("Aaaaand " + p1_3pt_name + " bears the pressure and makes the shot!");
                            p2Points += 3;
                        }
                    }
                    System.out.println();
//--------------------------------------------------------------------------------------------
                }else if (choice == 2){
                    if (player1turn) {
                        System.out.println(p1_mid_Name + " on the " + p1_team + " attempts a layup!\n...");
                        if (p1Players[1].layup(p2Players[1])){
                            System.out.println("Aaaaand " + p1_mid_Name + " jumps up and puts the ball in the net!");
                        }
                        else {
                            System.out.println("Aaaaand " + p1_mid_Name + " embarrassingly fails to hit the backboard!");
                        }

                    }
                    else {
                        System.out.println(p2_mid_Name + " on the " + p2_team + " attempts a layup!\n...");
                        if (p2Players[1].layup(p1Players[1])){
                            System.out.println("Aaaaand " + p2_mid_Name + " bounces the ball into the net!");
                        }
                        else {
                            System.out.println("Aaaaand " + p2_mid_Name + " it's no good!");
                        }
                    }
                    System.out.println();
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 3) {
                    if(player1turn){
                        System.out.println(p1_mid_Name + " attempts a Mid-Range shot!\n...");
                        p1Players[1].midRange();
                        if(p2Players[2].blocks(p1Players[1])){
                            System.out.println("Aaaaand " + p1_mid_Name + " misses the shot!");
                        }else {
                            System.out.println("Aaaaand " + p1_mid_Name + " sinks the Mid-Range shot!");
                            p1Points += 2;
                        }
                    }else{
                        System.out.println(p2_mid_Name + " attempts a Mid-Range shot!\n...");
                        p2Players[1].midRange();
                        if(p1Players[2].blocks(p2Players[1])){
                            System.out.println("Aaaaand " + p2_mid_Name + " misses the shot!");
                        }else {
                            System.out.println("Aaaaand " + p2_mid_Name + " sinks the Mid-Range shot!");
                            p2Points += 2;
                        }
                    }
                    System.out.println();
                }
//--------------------------------------------------------------------------------------------
                else if (choice == 4) {
                    if(player1turn){
                        System.out.println(p1_team + "'s Stats");
                        for(Player p: p1Players){
                            System.out.println(p);
                        }
                    }else{
                        System.out.println(p2_team + "'s Stats");
                        for(Player p: p2Players){
                            System.out.println(p);
                        }
                    }
                    System.out.println();
                } else if (choice == 5){
                    System.out.println("Final Score: \n");
                    System.out.println(p1_team + ": " + p1Points);
                    System.out.println(p2_team + ": " + p2Points + "\n");
                    String winner = (p1Points > p2Points) ? p1_team : p2_team;
                    System.out.println("The " + winner + " have won the game!\n");
                    System.out.println("getting toaster ready...");
                    s.close();
                    flag = false;
                }
//--------------------------------------------------------------------------------------------
            }
            catch (Exception e){

                System.out.println("Please type an integer 1-5 (or 0 to show instructions)");
                s.nextLine();
                player1turn = !player1turn;
            }
        }
    }

}
