package Unit7;

import java.util.Scanner;

public class TryCatchEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = getNextIntVal(in,1,5);
        System.out.println("Finally, " + choice);
    }
    public static int getNextIntVal(Scanner in, int min, int max){
        boolean flag = true;
        int num = 1;
        while (flag) {
            try {
                System.out.println("Enter int for from " + min + " - " + max + ".");
                num = in.nextInt();
                if (num <= max && num >= min) {
                    flag = false;
                } else {
                    System.out.println("invalid input enter an int between 9 and 12");
                }
            } catch (Exception e) {
                System.out.println("invalid input enter an int");
                in.nextLine();
            }
        }
        return num;
    }
}
