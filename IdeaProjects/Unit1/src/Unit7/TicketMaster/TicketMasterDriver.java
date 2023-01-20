package Unit7.TicketMaster;

import java.util.ArrayList;

public class TicketMasterDriver {
    public static void main(String[] args) {

        TicketMaster tG = new TicketMaster();
        ArrayList<Show> readFile = tG.fileInput();
        for (int i = 0;i< readFile.size();i++){
            System.out.println(readFile.get(i).toString());
        }
    }

}
