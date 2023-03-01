package Unit7.TicketMaster;

import java.util.Scanner;

public class TicketMasterDriver {
    private static final int SHOWMENU = 0;
    private static final int ATOZ = 1;
    private static final int ZTOA = 2;
    private static final int LTH = 3;
    private static final int HTL = 4;
    private static final int CITYSEARCH = 5;
    private static final int TOAST = 6;
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
    }

}
