package Unit7.TicketMaster;

import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        TicketMaster tG = new TicketMaster();

        tG.fileInput();
        System.out.println(tG.toString());

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
                else if (choice == 0){
                    System.out.println(tG.showInstruction());
                }
                else if (choice == 1){
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
                    System.out.println(tG.searchByCity());
                }
                else if (choice == 6){
                    System.out.println("Quit program");
                    flag = false;
                }
            }
            catch (Exception e){

                System.out.println("Please type an integer 1-6 (or 0 to show instructions)");
                myObj.nextLine();
            }
        }
    }

}
