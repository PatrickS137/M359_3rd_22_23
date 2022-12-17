package Unit6.arrays;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner myObj = new Scanner(System.in);
        TriviaGame tG = new TriviaGame();



        tG.fileInput();
        System.out.println("Welcome to this quiz thing, give me your name");
        String name = myObj.nextLine();

        System.out.println("alright " +name);
        System.out.println("Do you want to see instructions? yes or no");
        String instructionCheck = myObj.nextLine();
        instructionCheck = instructionCheck.toLowerCase();
        if (instructionCheck.equals("yes")) {
            System.out.println("Great this game is simple");
            System.out.println("when theres an question, type the letter of your answer");
            System.out.println("to go the next question type 'ANOTHER', and type 'bruh'  to give up");
            System.out.println("\ntype 'i have read all of the instructions and understand how this game works, so now I should be able to move on' to continue");
            String nothing = myObj.nextLine();
        }

        if (!instructionCheck.equals("no")){
            System.out.println("Ill take that as a no");
        }

        int fgvtrRhg = 0;
        while (fgvtrRhg < tG.getNumQs()){
            int whatQuestionIsThisQuizCurrentlyOnRightNowIsQuestionNumber = 0;
            tG.getRandomQuestion();
            String answer = myObj.nextLine();

            tG.checkAnswer(answer);
            System.out.println("do you want another? (type ANOTHER), do you wanna give up? (type bruh)");
            String nextQ = myObj.nextLine();
            nextQ = nextQ.toLowerCase();
            if (nextQ.equals("bruh")){
                fgvtrRhg = tG.getNumQs();
            }
            fgvtrRhg ++;
        }

        System.out.println("Total points: " + tG.getTotalPoints());
        System.out.println("Total # correct: " + tG.getTotalCorrect());
        System.out.println("percentage correct "+100* tG.getTotalCorrect()/tG.getCurrentQ());



    }
}
