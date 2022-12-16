package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Qeustion {

    //bruhhh








    
    //question counter
    //file length
    //numquestions
    //string used numbers

    //string for correct answer
    //int for question's points

    //total question array[numquestions]

    //method to store the stats variables(stats vars)
        //this.etc = etc
        //so on

    //method to input the storage array(storage array)
        //set total question[question counter] to storage array
        //question counter ++


    //method toString
        //call a random num in numquestions
        //if used numbers = question length then end the game(call a function in tirviagame)
        //else if num is in used numbers random again
        //else call in question array
            //sout the question and answerchoices
            //correct answer =...
            //question point =...

    private int currentQ;
    private int fileLen = 21;
    private int numQuestions = fileLen/7;
    private String numsUsed;

    Qeustion[] allQuestions = new Qeustion[numQuestions];

    private String text;
    private String answerChoices;
    private String correctAnswer;
    private int pointValue;
    private int question;
    public static String a;

    public Qeustion(String text, String answerChoices, String correctAnswer, int pointValue) {
        this.text = text;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }




}
