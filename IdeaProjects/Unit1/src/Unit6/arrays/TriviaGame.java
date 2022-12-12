package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //point values are randomized lunch cost(2.5 to 3.25), usd to indonesian dollar(rupiah)
    private int totalPoints;



    public TriviaGame() throws FileNotFoundException {
        System.out.println("a");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        fileInput(name);
        Question b = new Question();

        System.out.println(b);

    }

    public void fileInput(String name) throws FileNotFoundException {
        File allQuestions = new File ("mcQuestions.txt");
        Scanner inQ = new Scanner(allQuestions);

        while (inQ.hasNext()) {
            Question[] totalQuestions = new Question[20];
            for (int i = 0; i < totalQuestions.length; i++) {
                String text = inQ.nextLine();
                String answerChoices = inQ.nextLine() + "\n" + inQ.nextLine() + "\n" + inQ.nextLine() + "\n" + inQ.nextLine(); // reads the entire line until end of line char
                String correctAnswer = inQ.nextLine();
                int pointValue = inQ.nextInt();

                if (i < 7) {
                    inQ.nextLine();
                }
                Question d = new Question(text, answerChoices, correctAnswer, pointValue);
                totalQuestions[i] = d;
            }

            if (inQ.hasNext()) {
                inQ.nextLine();
            }
            Question q = new Question(name, totalQuestions);
            }
        }
}

