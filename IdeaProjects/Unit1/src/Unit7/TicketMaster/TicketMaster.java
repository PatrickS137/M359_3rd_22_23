package Unit7.TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class

TicketMaster {

    private int lineCount;
    Scanner inFile = null;
    //File allQuestions = new File("C:\\Users\\PC1\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");
    static File allQuestions = new File("C:\\Users\\sze1621\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");

    public static void fileInput() {
        ArrayList<Show> allTickets = new ArrayList<>();


        Scanner myTick = null;
        try {
            myTick = new Scanner(allQuestions);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        boolean isGoNext = true;
        int i = 0;
        while(isGoNext) {
            String date = "";

            try {
                date = myTick.next();
            } catch (Exception e) {
               break;
            }

            String price = myTick.next();

            String qty = myTick.next();
            String performer = myTick.next();
            if (performer.substring(performer.length() - 1) != ",") {

                performer += " " + myTick.next();
                performer = performer.substring(0, performer.length() - 1);
            }
            String city = myTick.nextLine();
            try {
                city = city.substring(1);
            }
            catch (Exception ignored){

            }

            Show oneTicket = new Show(date, price, qty, performer, city);

            allTickets.add(oneTicket);
            System.out.println(allTickets);
            System.out.println(oneTicket.toString());
        }
    }



}
