package Unit7.TicketMaster;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        TicketMaster tG = new TicketMaster();

        tG.fileInput();
        System.out.println(tG.toString());

        boolean flag = true;
        int num = 1;
        while (flag) {
            int choice;
            System.out.println("-------------------------------------------------------------\nType 1 to sort A-Z\nType 2 to sort Z-A\nType 3 to sort by ticket price low-high\nType 4 to sort by ticket price high-low\nType 5 to search by city\nType 6 to quit\n-------------------------------------------------------------");

            try{
                choice = myObj.nextInt();
                if (choice == 1){
                    System.out.println("sort A-Z");
                }
                else if (choice == 2){
                    System.out.println("sort Z-A");
                }
                else if (choice == 3){
                    System.out.println("sort low-high");
                }
                else if (choice == 4){
                    System.out.println("sort high-low");
                }
                else if (choice == 5){
                    System.out.println("sort city");
                }
                else if (choice == 6){
                    System.out.println("Quit program");
                    flag = false;
                }
            }
            catch (Exception e){
                System.out.println("Please type an integer 1-6");
                myObj.nextLine();
            }
        }
    }

}
