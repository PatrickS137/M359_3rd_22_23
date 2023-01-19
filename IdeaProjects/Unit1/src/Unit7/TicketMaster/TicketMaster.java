package Unit7.TicketMaster;

import Unit6.arrays.Question;
import Unit7.TryCatchEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class

TicketMaster {
    private int lineCount;
    Scanner inFile = null;
    File allQuestions = new File("C:\\Users\\PC1\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");


    ArrayList<Show> allTickets = new ArrayList<>();

    public ArrayList<Show> fileInput() throws FileNotFoundException {
        Scanner myTick = new Scanner(allQuestions);

        boolean isGoNext = true;
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
            catch (Exception e){

            }

            Show oneTicket = new Show(date, price, qty, performer, city);
            allTickets.add(oneTicket);
            System.out.println(oneTicket[1]);

        }
        return(allTickets);
    }



}
