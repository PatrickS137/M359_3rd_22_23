package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    //point values are randomized lunch cost(2.5 to 3.25), usd to indonesian dollar(rupiah)
    private String name;
    private int currentPoints;
    private Question[] questionArray;

    File questions = new File ("mcQuestions.txt");
    Scanner inQ = new Scanner(questions);

    public TriviaGame() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        
    }



}

