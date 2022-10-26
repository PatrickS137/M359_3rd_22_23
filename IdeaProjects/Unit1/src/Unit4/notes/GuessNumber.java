package Unit4.notes;

import java.util.Scanner;
public class GuessNumber {

    public static void main(String[] args) {
        int randNum = (int)(Math.random()*10 + 1);

        Scanner input = new Scanner(System.in);

        int guesses = 0;
        System.out.println("Enter a guess: (-999 to quit)");
        System.out.println("The number is " + randNum);

        int value = input.nextInt();

        while (value != -999) {
            guesses++;

            if (value > randNum){
                System.out.println("too high");
            }
            if (value < randNum){
                System.out.println("too low");
            }
            else{
                System.out.println("you guessed it in " + guesses + " tries!");
                break;
            }
            System.out.println("Enter a guess: (-999 to quit)");

            value = input.nextInt();


        }
    }
}
