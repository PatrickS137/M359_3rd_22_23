package Unit7.TicketMaster.U8.U9.Shape;

public class Shape {
    private String color;
    private int numSides;
    public Shape (String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }
    //abstract class
    public double getArea(){
        return 0;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "This " + color + " shape has " + numSides + " sides";
    }

    public String getColor(){
        return color;
    }

}
