package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question {
    private String text;
    private String answerChoices;
    private String correctAnswer;
    private int pointValue;
    private int question;

    public Question(String text, String answerChoices, String correctAnswer, int pointValue, int question) {
        this.text = text;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
        this.question = question;
    }

    public String toString(){
        return (question + ")  " + text + "\n" + answerChoices);
    }
}
