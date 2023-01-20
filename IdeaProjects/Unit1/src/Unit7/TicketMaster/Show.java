package Unit7.TicketMaster;

public class Show {


    private String date;
    private String price;
    private String qty;
    private String performer;
    private String city;





    public Show(String date, String price, String qty, String performer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }



    public String toString(){

        String output = "";
        output += date;
        output += "\t" + price;
        output += "\t\t" + qty;
        output += "\t\t" + performer;


        if (performer.length()<8){
            output += "\t\t\t\t\t";
        }
        else if (performer.length()<12){
            output += "\t\t\t\t";
        }
        else if (performer.length()<16){
            output += "\t\t\t";
        }
        else if (performer.length()<19){
            output += "\t\t";
        }

        output += city;

        return output;
    }

    //-------------------------------------------------------------------------

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}