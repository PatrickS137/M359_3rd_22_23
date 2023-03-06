package Unit7.TicketMaster.U8.U9.Shape;

public class ShapesTester {
    public static void main(String[] args) {
        Shape myShape = new Shape("Red", 12);
        Circle cubsLogo = new Circle("Blue",4);
        Rectangle billBoard = new Rectangle("Yellow", 100,40);
        Square keyCaps = new Square("Grey",2.1);
        System.out.println(myShape);
        System.out.println(cubsLogo);
        System.out.println(billBoard);
        System.out.println(keyCaps);
    }
}
