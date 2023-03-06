package Unit7.TicketMaster.U8.U9.Shape;

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle(String color, double width, double length){
        super(color, 4);
        this.width = width;
        this.length = length;
    }
    public void scaleSide(double scaleFactor){
        this.width *= scaleFactor;
        this.length *= scaleFactor;
    }

    public double findArea(){
        return width * length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void set(double length){
        this.length = length;
    }

}
