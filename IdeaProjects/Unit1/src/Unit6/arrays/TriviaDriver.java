package Unit6.arrays;

import java.util.Scanner;
import java.io.FileNotFoundException;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner myObj = new Scanner(System.in);
        TriviaGame tG = new TriviaGame();
        Question quQ = new Question();
        tG.fileInput();
        System.out.println("Welcome to this quiz thing, give me your name");
        String name = myObj.nextLine();

        System.out.println("Do you want to see instructions? yes or no");
        String instructionCheck = myObj.nextLine();
        instructionCheck = instructionCheck.toLowerCase();
        if (instructionCheck.equals("yes")){
            System.out.println("Great this game is simple");
            System.out.println("when theres an question, type the letter of your answer");
            System.out.println("to go the next question type 'ANOTHER', and type 'bruh'  to give up");
        }
        System.out.println("\ntype 'i have read all of the instructions and understand how this game works, so now I should be able to move on' to continue");
        String nothing = myObj.nextLine();


        if (!instructionCheck.equals("no") && nothing.equals("")){
            System.out.println("Ill take that as a no");
        }
        boolean fgvtrRhg = false;

        int whatQuestionIsThisQuizCurrentlyOnRightNowIsQuestionNumber = 0;
        tG.getRandomQuestion();
        String answer = myObj.nextLine();
        tG.checkAnswer(answer);





    }
}
