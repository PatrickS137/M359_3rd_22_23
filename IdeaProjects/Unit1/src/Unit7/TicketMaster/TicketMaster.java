package Unit7.TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {

    private int lineCount;
    private ArrayList<Show> allTickets;

    public TicketMaster() {
        allTickets= new ArrayList<>();
    }


    Scanner inFile = null;
    //static File allQuestions = new File("C:\\Users\\PC1\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");
    static File allQuestions = new File("C:\\Users\\sze1621\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");
    public String toString(){
        String output2 = "";
        output2 += "Date\t\tPrice\t\tQty\t\tArtist\t\t\t\t\tCity";
        output2 += ("\n____________________________________________________________________\n");
        for (int i = 0;i< allTickets.size();i++){
            output2 += allTickets.get(i).toString();
            output2 += "\n";
        }
        return output2;
    }
    public void fileInput() {
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
            while (!performer.substring(performer.length() - 1).equals(",")) {
                performer += " " + myTick.next();
            }
            performer = performer.substring(0, performer.length() - 1);
            String city = myTick.nextLine();
            try {
                city = city.substring(1);
            }
            catch (Exception ignored){

            }

            Show oneTicket = new Show(date, price, qty, performer, city);

            allTickets.add(oneTicket);

        }

    }


    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }

    public Scanner getInFile() {
        return inFile;
    }

    public void setInFile(Scanner inFile) {
        this.inFile = inFile;
    }

    public static File getAllQuestions() {
        return allQuestions;
    }

    public static void setAllQuestions(File allQuestions) {
        TicketMaster.allQuestions = allQuestions;
    }
}
