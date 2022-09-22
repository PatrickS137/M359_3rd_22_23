package Unit2.examples;

public  class RectangeDriver {
    //We need to make a main method so we can create Rectangle objects

    public static void main(String[] args) {
        //to create an object we need to use the following structure
        //ClassName varName = new ClassName(...Parameters...);

        //Actual params are 5 and 10
        //formal params are rectWidth and rectHeight
        Rectange r1 = new Rectange(5,10);

        //actual param is 6
        //formal param is side
        Rectange r2 = new Rectange(6);

        //to call methods, use dot notation structure
        //varName.methodName
        r2.printArea();
        r2.printPerimeter();
        r2.printArea();
        r2.printPerimeter();
    }
}
