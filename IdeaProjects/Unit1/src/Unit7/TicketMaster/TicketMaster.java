package Unit7.TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {

    private int lineCount;
    private ArrayList<Show> allTickets;
    Scanner myTick = null;

    public TicketMaster() {
        allTickets= new ArrayList<>();
    }
        Scanner inFile = null;
    //static File allQuestions = new File("C:\\Users\\PC1\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");
    static File allQuestions = new File("C:\\Users\\sze1621\\Documents\\GitHub\\M359_3rd_22_23\\IdeaProjects\\Unit1\\src\\Unit7\\TicketMaster\\showData.txt");
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * this function prints out all the data in the showData file formatted
     * @return output2
     */
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * This function collects the data from showData, and saves it in allTickets
     */
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void fileInput() {
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

            double price = myTick.nextDouble();

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
        myTick.close();
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * This function sorts the data from showData by high to low if highToLow = true,
     * or low to high if highToLow = false
     * @param highToLow
     */
    public void sortPrice(Boolean highToLow){
        //insertion sort
        for (int i = 1; i<allTickets.size();i++){
            double valueToInsert = allTickets.get(i).getPrice();
            Show lineToSave = allTickets.get(i);
            int position = i;
            if (highToLow){
                while (position >0 && allTickets.get(position - 1).getPrice() > valueToInsert){
                    //shift value at position -1 over to position
                    allTickets.set(position, allTickets.get(position-1));
                    //decrease position so I can continue checking values
                    position--;
                }
            }
            else{
                while (position >0 && allTickets.get(position - 1).getPrice() < valueToInsert){
                    //shift value at position -1 over to position
                    allTickets.set(position, allTickets.get(position-1));
                    //decrease position so I can continue checking values
                    position--;
                }
            }


            //at this point i have either checked all values and I belong at
            //position 0(so first check of while loop failed) OR I am larger than
            //next element, so I found where I belong, at position

            //now, you se the value at index position with the value we saved in
            //valueToInsert
            allTickets.set(position, lineToSave);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * This function sorts the data from showData by z to a if aToZ = true,
     * or a to z if aToZ = false
     * @param aToZ
     */
    public void sortAZ(Boolean aToZ){
        for (int i = 0; i < allTickets.size()-1; i++) {
            int firstArtist = i;

            for (int j = i+1;j<allTickets.size();j++){
                if (aToZ) {
                    if (allTickets.get(firstArtist).getPerformer().compareTo(allTickets.get(j).getPerformer()) > 0) {
                        firstArtist = j;

                    }
                }
                else{
                    if (allTickets.get(firstArtist).getPerformer().compareTo(allTickets.get(j).getPerformer()) < 0) {
                    firstArtist = j;
                    }
                }
            }
            Show temp = allTickets.get(firstArtist);
            allTickets.set(firstArtist, allTickets.get(i));
            allTickets.set(i,temp);

        }
    }


    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    /**
     * this function prints out the instructions
     * @return
     */
    public String showInstruction(){
        return("-------------------------------------------------------------\nType 1 to sort A-Z\nType 2 to sort Z-A\nType 3 to sort by ticket price low-high\nType 4 to sort " +
                "by ticket price high-low\nType 5 to search by city\nType 6 to quit\n-------------------------------------------------------------");
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * This function takes the user input of the city the user wants to search. If the city input is not in the data,
     * it prompts for another input or quit.  If the city input is valid, then it prints all corresponding lines.
     * @return
     */
    public String searchByCity() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the name of the city you want to search");

        String searchResult = "";
        boolean isNext = true;
        while (isNext) {
            String searchInput = myObj.nextLine().toLowerCase();

            for (int i = 0; i < allTickets.size(); i++) {
                if (searchInput.equals(allTickets.get(i).getCity().toLowerCase())) {
                    searchResult +="\n" + allTickets.get(i).toString();


                }
            }
            if (!searchResult.equals("")){
                searchResult = "Date\t\tPrice\t\tQty\t\tArtist\t\t\t\t\tCity\n-------------------------------------------------------------" + searchResult;
                searchResult += "\n-------------------------------------------------------------";
                return searchResult;
            }

            System.out.println("that is not a valid city, type 7 to quit, or 8 to search another city");
            try {
                int choice = myObj.nextInt();
                if (choice == 7) {
                    searchResult = "exiting...";
                    isNext = false;
                } else if (choice == 8) {
                    System.out.println("Enter the name of the city you want to search");
                    searchInput = myObj.nextLine().toLowerCase();
                } else {
                    searchResult = "enter 7 or 8";
                }
            } catch (Exception e) {
                searchResult = "that is not a valid input";
            }

        //searchResult += allTickets.get(i).toString();
        //searchResult += "\n";
        }
        return searchResult;
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
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
