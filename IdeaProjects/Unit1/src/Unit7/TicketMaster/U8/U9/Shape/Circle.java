package Unit7.TicketMaster.U8.U9.Shape;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color, 0);
        this.radius = radius;
    }

    public String toString(){
        return "This " + super.getColor() + " circle has a radius of " + radius;

    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
