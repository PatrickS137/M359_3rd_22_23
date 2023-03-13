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


        boolean flag = true;
        int num = 1;
        System.out.println("type 0 to show instructions again");
        System.out.println(tG.showInstruction());
        while (flag) {
            int choice;


            System.out.println("Enter number here...");
            try{
                choice = myObj.nextInt();
                if (choice <0|| choice >6){
                    System.out.println("Please type an integer 1-6 (or 0 to show instructions)");
                    myObj.nextLine();
                }
                else if (choice == SHOWMENU){
                    System.out.println(tG.showInstruction());
                }
                else if (choice == ATOZ){
                    System.out.println("Sorting from A-Z...");
                    tG.sortAZ(true);
                    System.out.println(tG.toString());
                }
                else if (choice == ZTOA){
                    System.out.println("Sorting from Z-A...");
                    tG.sortAZ(false);
                    System.out.println(tG.toString());
                }
                else if (choice == LTH){
                    System.out.println("Sorting from Low to High...");
                    tG.sortPrice(true);
                    System.out.println(tG.toString());
                }
                else if (choice == HTL){
                    System.out.println("Sorting from High To Low...");
                    tG.sortPrice(false);
                    System.out.println(tG.toString());
                }
                else if (choice == CITYSEARCH){
                    System.out.println(tG.searchByCity());
                }
                else if (choice == TOAST){
                    System.out.println("getting toaster ready...");
                    myObj.close();
                    flag = false;
                }
            }
            catch (Exception e){

                System.out.println("Please type an integer 1-6 (or 0 to show instructions)");
                myObj.nextLine();
            }
        }
        String showCommands = "";
        showCommands+=  "╒═══════════════════╕";
        showCommands+="\n▓   COMMANDS";
        showCommands+="\n▓   0 for Commands";
        showCommands+="\n▓   1 for 3 Pointer";
        showCommands+="\n▓   2 for Layup";
        showCommands+="\n▓   3 for Mid range";
        showCommands+="\n╘═══════════════════╛";



        Scanner s = new Scanner(System.in);
        System.out.println("Player 1, enter your team name");
        String p1_team = s.nextLine();
        System.out.println("Player 1, enter the statistics of your players");
        System.out.println("Speed: ");
        int p1_speed = s.nextInt();
        System.out.println("Strength: ");
        int p1_strength = s.nextInt();
        System.out.println("Player 1, enter the name of your Three-Point Shooter");
        String p1_3pt_name = s.nextLine();
        System.out.println("Three Point Percentage: ");
        int p1_3pt_pct = s.nextInt();
        System.out.println("Handles: ");
        int p1_3pt_handles = s.nextInt();
        System.out.println("Player 1, enter the name of your Mid-Range Player");
        String p1_mid_Name = s.nextLine();
        System.out.println("Mid Range Percentage: ");
        int p1_mid_pct = s.nextInt();
        System.out.println("Layup Percentage: ");
        int p1_layup_pct = s.nextInt();
        System.out.println("Player 1, enter the name of your Defensive Player");
        String p1_def_Name = s.nextLine();
        System.out.println("Block Percentage: ");
        int p1_def_block = s.nextInt();
        Three_Pt_Shooter p1_3pt = new Three_Pt_Shooter(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_3pt_pct, p1_3pt_handles);
        Mid_Player p1_mid = new Mid_Player(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_mid_pct, p1_layup_pct);
        Defense_Guy p1_def = new Defense_Guy(p1_3pt_name, p1_team, p1_speed, p1_strength, p1_def_block);
        System.out.println("Player 1's team created");
        //player1Stats+="\n╞
        String player1Stats = "";
        player1Stats+=  "╭── ⋅ ⋅ ── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ── ⋅ ⋅ ──╮";
        player1Stats+="\n╞ Player 1";
        player1Stats+="\n╞ Name: " + p1_team;
        player1Stats+="\n╞ Sped: " + p1_speed;
        player1Stats+="\n╞ Strength: " + p1_strength;
        player1Stats+="\n╞ 3 point player: ";
        player1Stats+="\n╞ \t Name: " + p1_3pt_name;
        player1Stats+="\n╞ \t Percent: " + p1_3pt_pct;
        player1Stats+="\n╞ \t Handles: " + p1_3pt_handles;
        player1Stats+="\n╞ Mid range player: " ;
        player1Stats+="\n╞ \t Name: " + p1_mid_Name;
        player1Stats+="\n╞ \t Percent: " + p1_mid_pct;
        player1Stats+="\n╞ \t Layups: " + p1_layup_pct;
        player1Stats+="\n╞ Defensive player: ";

        player1Stats+="\n╰── ⋅ ⋅ ── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ── ⋅ ⋅ ──╯";

        System.out.println(player1Stats);




        System.out.println("Player 2, enter your team name");
        String p2_team = s.nextLine();
        System.out.println("Player 2, enter the statistics of your players");
        System.out.println("Speed: ");
        int p2_speed = s.nextInt();
        System.out.println("Strength: ");
        int p2_strength = s.nextInt();
        System.out.println("Player 2, enter the name of your Three-Point Shooter");
        String p2_3pt_name = s.nextLine();
        System.out.println("Three Point Percentage: ");
        int p2_3pt_pct = s.nextInt();
        System.out.println("Handles: ");
        int p2_3pt_handles = s.nextInt();
        System.out.println("Player 2, enter the name of your Mid-Range Player");
        String p2_mid_Name = s.nextLine();
        System.out.println("Mid Range Percentage: ");
        int p2_mid_pct = s.nextInt();
        System.out.println("Layup Percentage: ");
        int p2_layup_pct = s.nextInt();
        System.out.println("Player 2, enter the name of your Defensive Player");
        String p2_def_Name = s.nextLine();
        System.out.println("Block Percentage: ");
        int p2_def_block = s.nextInt();
        Three_Pt_Shooter p2_3pt = new Three_Pt_Shooter(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_3pt_pct, p2_3pt_handles);
        Mid_Player p2_mid = new Mid_Player(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_mid_pct, p2_layup_pct);
        Defense_Guy p2_def = new Defense_Guy(p2_3pt_name, p2_team, p2_speed, p2_strength, p2_def_block);
        System.out.println("Player 2's team created");

        String player2Stats = "";
        player2Stats+=  "╭── ⋅ ⋅ ── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ── ⋅ ⋅ ──╮";
        player2Stats+="\n╞ Player 2";
        player2Stats+="\n╞ Name: ";
        player2Stats+="\n╞ 3 point player: ";
        player2Stats+="\n╞ Mid range player: ";
        player2Stats+="\n╞ Defensive player: ";
        player2Stats+="\n╰── ⋅ ⋅ ── ⋅ ⋅ ── ✩ ── ⋅ ⋅ ── ⋅ ⋅ ──╯";

        System.out.println(player2Stats);



        System.out.println("ruUHDVAHJKLSGFEUHYSDVnning");

    }

}
