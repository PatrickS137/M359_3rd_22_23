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
                    System.out.println("Sorting from A-Z...");
                    tG.sortAZ(true);
                    System.out.println(tG.toString());
                }
                else if (choice == 2){
                    System.out.println("Sorting from A-Z...");
                    tG.sortAZ(false);
                    System.out.println(tG.toString());
                }
                else if (choice == 3){
                    System.out.println("Sorting from Low to High...");
                    tG.sortPrice(true);
                    System.out.println(tG.toString());
                }
                else if (choice == 4){
                    System.out.println("Sorting from High To Low...");
                    tG.sortPrice(false);
                    System.out.println(tG.toString());
                }
                else if (choice == 5){
                    System.out.println(tG.searchByCity());
                }
                else if (choice == 6){
                    System.out.println("getting toaster ready...");
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
