package Unit2.homework;

import java.util.Scanner;
public class Mathws5 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter x1:");
        double x1 = myObj.nextDouble();
        System.out.println("Enter y1:");
        double y1 = myObj.nextDouble();
        System.out.println("Enter x2:");
        double x2 = myObj.nextDouble();
        System.out.println("Enter y2:");
        double y2 = myObj.nextDouble();
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
}
