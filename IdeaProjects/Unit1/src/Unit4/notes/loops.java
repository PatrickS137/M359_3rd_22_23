package Unit4.notes;

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        System.out.println("Enter an int: (-999 to quit)");
        int value = input.nextInt();

        while (value != -999){
            sum += value;
            count++;
            System.out.println("Enter an int: (-999 to quit)");

            value = input.nextInt();

        }
        // user will enter -999 to exit

        //need int vars for sum and count
        // prompt the user for their value
        //while a loop making sure they want to continue
        //add to the sum
        //increment the count
        
        //calculate the average

        double avg = (double)sum/count;
        System.out.println("The average is: " + avg);
        //print

    }
}
