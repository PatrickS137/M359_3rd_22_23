package Unit7.TicketMaster;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) {
        TicketMaster tG = new TicketMaster();
        try {
            tG.fileInput();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
