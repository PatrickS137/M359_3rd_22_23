package Unit2.examples;

public class Rectange {
    /*
    these are instance variables 0 they are created for every instance of the
    Rectange class

    We use the visibility modifier of private so that their values can only be
    directly accessed from methods within the rectangle class

    These variables are declared before the constructor to give them global
    scope throughout the class. They are given their initial values inside the constructor
     */



    /*
    This is the constructor.  it is used to create (or construct) an object of the
    class. It is called along with the keyword new

    It's method header has NO return type and its name is the same as the name of the class

    You are allowed to have more than one constructor as long as the parameter list is different
     */

    private int width;
    private int height;

    public Rectange(int rectWidth, int rectHeight){
        width = rectWidth;
        height = rectHeight;
    }
    //this constructor only takes in one value - and creates a square
    public Rectange(int side) {
        width = side;
        height = side;
    }


    public void printArea() {
        System.out.println("the area is: " + width * height);
    }

    public void printPerimeter() {
        int p = 2*height + 2*width;
        System.out.println("The perimeter is: " + p);
    }

}

