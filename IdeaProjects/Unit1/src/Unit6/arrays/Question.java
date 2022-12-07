package Unit6.arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question {
    private String text;
    private String answerChoices;
    private String correctAnswer;
    private int pointValue;

    public Question(String text, String answerChoices, String correctAnswer, int pointValue) {
        this.text = text;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
        this.pointValue = pointValue;
    }
}
